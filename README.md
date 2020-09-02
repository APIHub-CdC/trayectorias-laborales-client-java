# trayectorias-laborales-client-java

API para consulta de Trayectorias Laborales (Empleos, Cedulas y Listas).

## Requisitos

1. Java >= 1.7
2. Maven >= 3.3
## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:
```shell
mvn install -Dmaven.test.skip=true
```
## Guía de inicio

### Paso 1. Generar llave y certificado

Antes de lanzar la prueba se deberá tener un keystore para la llave privada y el certificado asociado a ésta.
Para generar el keystore se ejecutan las instrucciones que se encuentran en ***src/main/security/createKeystore.sh*** o con los siguientes comandos:

**Opcional**: Si desea cifrar su contenedor, coloque una contraseña en una variable de ambiente.

```shell
export KEY_PASSWORD=your_super_secure_password
```

**Opcional**: Si desea cifrar su keystore, coloque una contraseña en una variable de ambiente.

```shell
export KEYSTORE_PASSWORD=your_super_secure_keystore_password
```

- Definición de los nombres de archivos y alias.

```shell
export PRIVATE_KEY_FILE=pri_key.pem
export CERTIFICATE_FILE=certificate.pem
export SUBJECT=/C=MX/ST=MX/L=MX/O=CDC/CN=CDC
export PKCS12_FILE=keypair.p12
export KEYSTORE_FILE=keystore.jks
export ALIAS=cdc
```
- Generar llave y certificado.

```shell
# Genera la llave privada.
openssl ecparam -name secp384r1 -genkey -out ${PRIVATE_KEY_FILE}

# Genera el certificado público
openssl req -new -x509 -days 365 \
  -key ${PRIVATE_KEY_FILE} \
  -out ${CERTIFICATE_FILE} \
  -subj "${SUBJECT}"

```

- Generar contenedor PKCS12 a partir de la llave privada y el certificado

```shell
# Genera el archivo pkcs12 a partir de la llave privada y el certificado.
# Deberá empaquetar su llave privada y el certificado.

openssl pkcs12 -name ${ALIAS} \
  -export -out ${PKCS12_FILE} \
  -inkey ${PRIVATE_KEY_FILE} \
  -in ${CERTIFICATE_FILE} \
  -password pass:${KEY_PASSWORD}

```

- Generar un keystore dummy y eliminar su contenido.

```sh
#Genera un Keystore con un par de llaves dummy.
keytool -genkey -alias dummy -keyalg RSA \
    -keysize 2048 -keystore ${KEYSTORE_FILE} \
    -dname "CN=dummy, OU=, O=, L=, S=, C=" \
    -storepass ${KEYSTORE_PASSWORD} -keypass ${KEY_PASSWORD}
#Elimina el par de llaves dummy.
keytool -delete -alias dummy \
    -keystore ${KEYSTORE_FILE} \
    -storepass ${KEYSTORE_PASSWORD}
```

- Importar el contenedor PKCS12 al keystore

```sh
#Importamos el contenedor PKCS12
keytool -importkeystore -srckeystore ${PKCS12_FILE} \
  -srcstoretype PKCS12 \
  -srcstorepass ${KEY_PASSWORD} \
  -destkeystore ${KEYSTORE_FILE} \
  -deststoretype JKS -storepass ${KEYSTORE_PASSWORD} \
  -alias ${ALIAS}
#Lista el contenido del Kesystore para verificar que
keytool -list -keystore ${KEYSTORE_FILE} \
  -storepass ${KEYSTORE_PASSWORD}
```

### Paso 2. Carga del certificado dentro del portal de desarrolladores

 1. Iniciar sesión.
 2. Dar clic en la sección "**Mis aplicaciones**".
 3. Seleccionar la aplicación.
 4. Ir a la pestaña de "**Certificados para @tuApp**".
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/applications.png">
    </p>
 5. Al abrirse la ventana, seleccionar el certificado previamente creado y dar clic en el botón "**Cargar**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/upload_cert.png">
    </p>

### Paso 3. Descarga del certificado de Círculo de Crédito dentro del portal de desarrolladores

 1. Iniciar sesión.
 2. Dar clic en la sección "**Mis aplicaciones**".
 3. Seleccionar la aplicación.
 4. Ir a la pestaña de "**Certificados para @tuApp**".
    <p align="center">
        <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/applications.png">
    </p>
 5. Al abrirse la ventana, dar clic al botón "**Descargar**":
    <p align="center">
        <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/download_cert.png">
    </p>

### Paso 4. Modificar archivo de configuraciones

Para hacer uso del certificado que se descargó y el keystore que se creó se deberán modificar las rutas que se encuentran e
```properties
keystore_file=your_path_for_your_keystore/keystore.jks
cdc_cert_file=your_path_for_certificate_of_cdc/cdc_cert.pem
keystore_password=your_super_secure_keystore_password
key_alias=cdc
key_password=your_super_secure_password
```
### Paso 5. Modificar URL y datos de petición

En el archivo ApiTest.java, que se encuentra en ***src/test/java/io/tl/mx/client/api/***. Por tanto, se deberá modificar la URL (**urlApi**); el usuario (**Username**) y contraseña (**Password**) de autenticación de acceso básica; y la API KEY (**xApiKey**), que se muestra en el siguiente fragmento de código:


> **NOTA:** Los datos de la siguiente petición son solo representativos.

```java
public class ApiTest {
    
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private final ConsultaApi api = new ConsultaApi();
	private ApiClient apiClient = null;  
	private static final String xApiKey = "your_api_key";
	private static final String Authorization = "Authorization";
	private static final String Username = "your-basic-auth-username";
	private static final String Password = "your-basic-auth-password";
	private static final String urlApi = "the_url";
	    
	@Before()
	public void setUp() {
		//...code
	}
	    
	@Test
	public void consultarTrayectoriasTest() throws ApiException {
	    Busqueda busqueda = new Busqueda();
	    PersonaConsulta persona = new PersonaConsulta();
	    DomicilioConsulta domicilio = new DomicilioConsulta();
	    
	    Integer estatusOK = 200;
	    Integer estatusNoContent = 204;
	    
	    try {
	        
	        persona.setPrimerNombre("Juann");
	        persona.setApellidoPaterno("Pruebauno");
	        persona.setApellidoMaterno("Pruebauno");
	        persona.setFechaNacimiento("1986-12-01");
	        persona.setSexo(CatalogoSexoPersona.M);
	        
	        domicilio.setDireccion("TORNO 301 EL ROSARIO");
	        domicilio.setColonia("PEDREGAL DE SANTO DOMINGO");
	        domicilio.setCp("02100");
	        
	        busqueda.setClaveEmpresaConsulta("2007310044");
	        busqueda.setFolioConsultaEmpleador("2620100");
	        busqueda.setProductoRequerido(new BigDecimal(4));
	        busqueda.setPuestoSolicitado("Vendedor muebles");
	        busqueda.setPersona(persona);
	        busqueda.setDomicilio(domicilio);
	        
	        ApiResponse<?> response = api.genericConsultarTrayectorias(xApiKey, busqueda);
	  
	        Assert.assertTrue(estatusOK.equals(response.getStatusCode()));
	        
	        if(estatusOK.equals(response.getStatusCode())) {
	            Respuesta responseOK = (Respuesta) response.getData();
	            logger.info(responseOK.toString());
	        }
	        
	    }catch (ApiException e) {
	        if(!estatusNoContent.equals(e.getCode())) {
	            logger.info(e.getResponseBody());
	        }
	        Assert.assertTrue(estatusOK.equals(e.getCode()));
	    }
	
	}

}

```
### Paso 6. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:
```shell
mvn test -Dmaven.install.skip=true
```
