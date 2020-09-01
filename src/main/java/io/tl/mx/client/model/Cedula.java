package io.tl.mx.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.tl.mx.client.model.CatalogoSexoCedula;
import io.tl.mx.client.model.CatalogoTipoCedula;
import java.math.BigDecimal;

public class Cedula {
  @SerializedName("numero")
  private BigDecimal numero = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("sexo")
  private CatalogoSexoCedula sexo = null;
  @SerializedName("profesion")
  private String profesion = null;
  @SerializedName("anioExpedicion")
  private BigDecimal anioExpedicion = null;
  @SerializedName("institucion")
  private String institucion = null;
  @SerializedName("tipo")
  private CatalogoTipoCedula tipo = null;
  @SerializedName("claveArc")
  private String claveArc = null;
  public Cedula numero(BigDecimal numero) {
    this.numero = numero;
    return this;
  }
   
  @ApiModelProperty(example = "9765.0", value = "Matrícula de identificación y respaldo del ejercicio profesional de la persona a consultar.")
  public BigDecimal getNumero() {
    return numero;
  }
  public void setNumero(BigDecimal numero) {
    this.numero = numero;
  }
  public Cedula apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA PATERNO", value = "Apellido Paterno de la persona consultada.")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public Cedula apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA MATERNO", value = "Apellido Materno de la persona consultada.")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public Cedula nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }
   
  @ApiModelProperty(example = "JUAN", value = "Nombre(s) propio de la persona consultada.")
  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }
  public Cedula sexo(CatalogoSexoCedula sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoSexoCedula getSexo() {
    return sexo;
  }
  public void setSexo(CatalogoSexoCedula sexo) {
    this.sexo = sexo;
  }
  public Cedula profesion(String profesion) {
    this.profesion = profesion;
    return this;
  }
   
  @ApiModelProperty(example = "Ingeniero en computacion", value = "Profesión registrada.")
  public String getProfesion() {
    return profesion;
  }
  public void setProfesion(String profesion) {
    this.profesion = profesion;
  }
  public Cedula anioExpedicion(BigDecimal anioExpedicion) {
    this.anioExpedicion = anioExpedicion;
    return this;
  }
   
  @ApiModelProperty(example = "2010.0", value = "Año en el que fue expedida la cédula.")
  public BigDecimal getAnioExpedicion() {
    return anioExpedicion;
  }
  public void setAnioExpedicion(BigDecimal anioExpedicion) {
    this.anioExpedicion = anioExpedicion;
  }
  public Cedula institucion(String institucion) {
    this.institucion = institucion;
    return this;
  }
   
  @ApiModelProperty(example = "UNAM", value = "Institución donde fue expedida la cédula.")
  public String getInstitucion() {
    return institucion;
  }
  public void setInstitucion(String institucion) {
    this.institucion = institucion;
  }
  public Cedula tipo(CatalogoTipoCedula tipo) {
    this.tipo = tipo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoTipoCedula getTipo() {
    return tipo;
  }
  public void setTipo(CatalogoTipoCedula tipo) {
    this.tipo = tipo;
  }
  public Cedula claveArc(String claveArc) {
    this.claveArc = claveArc;
    return this;
  }
   
  @ApiModelProperty(example = "1242687", value = "Clave de reclamación de datos ARCO.")
  public String getClaveArc() {
    return claveArc;
  }
  public void setClaveArc(String claveArc) {
    this.claveArc = claveArc;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cedula cedula = (Cedula) o;
    return Objects.equals(this.numero, cedula.numero) &&
        Objects.equals(this.apellidoPaterno, cedula.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, cedula.apellidoMaterno) &&
        Objects.equals(this.nombres, cedula.nombres) &&
        Objects.equals(this.sexo, cedula.sexo) &&
        Objects.equals(this.profesion, cedula.profesion) &&
        Objects.equals(this.anioExpedicion, cedula.anioExpedicion) &&
        Objects.equals(this.institucion, cedula.institucion) &&
        Objects.equals(this.tipo, cedula.tipo) &&
        Objects.equals(this.claveArc, cedula.claveArc);
  }
  @Override
  public int hashCode() {
    return Objects.hash(numero, apellidoPaterno, apellidoMaterno, nombres, sexo, profesion, anioExpedicion, institucion, tipo, claveArc);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cedula {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    profesion: ").append(toIndentedString(profesion)).append("\n");
    sb.append("    anioExpedicion: ").append(toIndentedString(anioExpedicion)).append("\n");
    sb.append("    institucion: ").append(toIndentedString(institucion)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    claveArc: ").append(toIndentedString(claveArc)).append("\n");
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
