package io.tl.mx.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.tl.mx.client.model.CatalogoSexoPersona;

public class PersonaConsulta {
  @SerializedName("primerNombre")
  private String primerNombre = null;
  @SerializedName("segundoNombre")
  private String segundoNombre = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("sexo")
  private CatalogoSexoPersona sexo = null;
  public PersonaConsulta primerNombre(String primerNombre) {
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
  public PersonaConsulta segundoNombre(String segundoNombre) {
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
  public PersonaConsulta apellidoPaterno(String apellidoPaterno) {
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
  public PersonaConsulta apellidoMaterno(String apellidoMaterno) {
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
  public PersonaConsulta fechaNacimiento(String fechaNacimiento) {
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
  public PersonaConsulta sexo(CatalogoSexoPersona sexo) {
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
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonaConsulta personaConsulta = (PersonaConsulta) o;
    return Objects.equals(this.primerNombre, personaConsulta.primerNombre) &&
        Objects.equals(this.segundoNombre, personaConsulta.segundoNombre) &&
        Objects.equals(this.apellidoPaterno, personaConsulta.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, personaConsulta.apellidoMaterno) &&
        Objects.equals(this.fechaNacimiento, personaConsulta.fechaNacimiento) &&
        Objects.equals(this.sexo, personaConsulta.sexo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonaConsulta {\n");
    
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
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
