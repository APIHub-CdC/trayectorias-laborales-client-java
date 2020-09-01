package io.tl.mx.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.tl.mx.client.model.CatalogoEntidadAfiliadora;
import io.tl.mx.client.model.CatalogoEstadoCivil;
import io.tl.mx.client.model.CatalogoNacionalidad;
import io.tl.mx.client.model.CatalogoResidencia;
import io.tl.mx.client.model.CatalogoSexoPersona;

public class Persona {
  @SerializedName("primerNombre")
  private String primerNombre = null;
  @SerializedName("segundoNombre")
  private String segundoNombre = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("CURP")
  private String CURP = null;
  @SerializedName("NSS")
  private String NSS = null;
  @SerializedName("entidadAfiliadora")
  private CatalogoEntidadAfiliadora entidadAfiliadora = null;
  @SerializedName("nacionalidad")
  private CatalogoNacionalidad nacionalidad = null;
  @SerializedName("estadoCivil")
  private CatalogoEstadoCivil estadoCivil = null;
  @SerializedName("sexo")
  private CatalogoSexoPersona sexo = null;
  @SerializedName("residencia")
  private CatalogoResidencia residencia = null;
  public Persona primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }
   
  @ApiModelProperty(example = "JUAN", required = true, value = "Primer nombre propio de la persona.")
  public String getPrimerNombre() {
    return primerNombre;
  }
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }
  public Persona segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }
   
  @ApiModelProperty(example = "PEDRO", value = "Segundo nombre propio de la persona.")
  public String getSegundoNombre() {
    return segundoNombre;
  }
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }
  public Persona apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA PATERNO", required = true, value = "Apellido Paterno de la persona.")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public Persona apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA MATERNO", required = true, value = "Apellido Materno de la persona.")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public Persona apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA ADICIONAL", value = "Apellido de casada de la persona consultada.")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }
  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }
  public Persona fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "1986-03-31", required = true, value = "Día, mes y año en que nació la persona.")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public Persona RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }
   
  @ApiModelProperty(example = "RFCC87090876T", value = "Registro Federal de Contribuyentes (RFC) es una clave alfanumérica que sirve para identificar como contribuyentes a las personas físicas o morales.")
  public String getRFC() {
    return RFC;
  }
  public void setRFC(String RFC) {
    this.RFC = RFC;
  }
  public Persona CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }
   
  @ApiModelProperty(example = "RFCC870909876HCM0", value = "Clave Única de Registro de Población alfanumérico utilizado para identificar oficialmente tanto a residentes como a ciudadanos mexicanos de todo el país.")
  public String getCURP() {
    return CURP;
  }
  public void setCURP(String CURP) {
    this.CURP = CURP;
  }
  public Persona NSS(String NSS) {
    this.NSS = NSS;
    return this;
  }
   
  @ApiModelProperty(example = "76765622", value = "Número de Seguridad Social permanente e intransferible asignado por el Instituto a cada trabajador que cotiza en el IMSS.")
  public String getNSS() {
    return NSS;
  }
  public void setNSS(String NSS) {
    this.NSS = NSS;
  }
  public Persona entidadAfiliadora(CatalogoEntidadAfiliadora entidadAfiliadora) {
    this.entidadAfiliadora = entidadAfiliadora;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoEntidadAfiliadora getEntidadAfiliadora() {
    return entidadAfiliadora;
  }
  public void setEntidadAfiliadora(CatalogoEntidadAfiliadora entidadAfiliadora) {
    this.entidadAfiliadora = entidadAfiliadora;
  }
  public Persona nacionalidad(CatalogoNacionalidad nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoNacionalidad getNacionalidad() {
    return nacionalidad;
  }
  public void setNacionalidad(CatalogoNacionalidad nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public Persona estadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoEstadoCivil getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }
  public Persona sexo(CatalogoSexoPersona sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public CatalogoSexoPersona getSexo() {
    return sexo;
  }
  public void setSexo(CatalogoSexoPersona sexo) {
    this.sexo = sexo;
  }
  public Persona residencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoResidencia getResidencia() {
    return residencia;
  }
  public void setResidencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.primerNombre, persona.primerNombre) &&
        Objects.equals(this.segundoNombre, persona.segundoNombre) &&
        Objects.equals(this.apellidoPaterno, persona.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, persona.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, persona.apellidoAdicional) &&
        Objects.equals(this.fechaNacimiento, persona.fechaNacimiento) &&
        Objects.equals(this.RFC, persona.RFC) &&
        Objects.equals(this.CURP, persona.CURP) &&
        Objects.equals(this.NSS, persona.NSS) &&
        Objects.equals(this.entidadAfiliadora, persona.entidadAfiliadora) &&
        Objects.equals(this.nacionalidad, persona.nacionalidad) &&
        Objects.equals(this.estadoCivil, persona.estadoCivil) &&
        Objects.equals(this.sexo, persona.sexo) &&
        Objects.equals(this.residencia, persona.residencia);
  }
  @Override
  public int hashCode() {
    return Objects.hash(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, apellidoAdicional, fechaNacimiento, RFC, CURP, NSS, entidadAfiliadora, nacionalidad, estadoCivil, sexo, residencia);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    NSS: ").append(toIndentedString(NSS)).append("\n");
    sb.append("    entidadAfiliadora: ").append(toIndentedString(entidadAfiliadora)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
