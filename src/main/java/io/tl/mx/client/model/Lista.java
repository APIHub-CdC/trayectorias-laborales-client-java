package io.tl.mx.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class Lista {
  @SerializedName("nombre")
  private String nombre = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("CURP")
  private String CURP = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("lista")
  private String lista = null;
  @SerializedName("estatus")
  private String estatus = null;
  @SerializedName("dependencia")
  private String dependencia = null;
  @SerializedName("puesto")
  private String puesto = null;
  @SerializedName("nivel")
  private BigDecimal nivel = null;
  @SerializedName("parentesco")
  private String parentesco = null;
  @SerializedName("ISSSTE")
  private String ISSSTE = null;
  public Lista nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }
   
  @ApiModelProperty(example = "JUAN", value = "Nombre de la persona expuesta.")
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Lista apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA PATERNO", value = "Apellido paterno de la persona expuesta.")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public Lista apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA MATERNO", value = "Apellido materno de la persona expuesta.")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public Lista CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }
   
  @ApiModelProperty(example = "RFCC870909876HCM0", value = "CURP de la persona expuesta.")
  public String getCURP() {
    return CURP;
  }
  public void setCURP(String CURP) {
    this.CURP = CURP;
  }
  public Lista fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "05/07/1985", value = "Fecha de nacimiento de la persona expuesta.")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public Lista lista(String lista) {
    this.lista = lista;
    return this;
  }
   
  @ApiModelProperty(example = "Bureau of Industry and Security", value = "Lista en la que esta reportada la persona expuesta.")
  public String getLista() {
    return lista;
  }
  public void setLista(String lista) {
    this.lista = lista;
  }
  public Lista estatus(String estatus) {
    this.estatus = estatus;
    return this;
  }
   
  @ApiModelProperty(example = "7 Años\"", value = "Estatus en el que se encuentra la persona expuesta.")
  public String getEstatus() {
    return estatus;
  }
  public void setEstatus(String estatus) {
    this.estatus = estatus;
  }
  public Lista dependencia(String dependencia) {
    this.dependencia = dependencia;
    return this;
  }
   
  @ApiModelProperty(example = "MUNICIPIO COATZACOALCOS", value = "Dependencia donde esta reportada la persona expuesta.")
  public String getDependencia() {
    return dependencia;
  }
  public void setDependencia(String dependencia) {
    this.dependencia = dependencia;
  }
  public Lista puesto(String puesto) {
    this.puesto = puesto;
    return this;
  }
   
  @ApiModelProperty(example = "Presidente Municipal (PRI)", value = "Puesto laboral con el que está expuesta la persona.")
  public String getPuesto() {
    return puesto;
  }
  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }
  public Lista nivel(BigDecimal nivel) {
    this.nivel = nivel;
    return this;
  }
   
  @ApiModelProperty(example = "331.0", value = "Nivel en el que se encuentra la persona expuesta.")
  public BigDecimal getNivel() {
    return nivel;
  }
  public void setNivel(BigDecimal nivel) {
    this.nivel = nivel;
  }
  public Lista parentesco(String parentesco) {
    this.parentesco = parentesco;
    return this;
  }
   
  @ApiModelProperty(example = "NA", value = "Alias de la persona expuesta.")
  public String getParentesco() {
    return parentesco;
  }
  public void setParentesco(String parentesco) {
    this.parentesco = parentesco;
  }
  public Lista ISSSTE(String ISSSTE) {
    this.ISSSTE = ISSSTE;
    return this;
  }
   
  @ApiModelProperty(example = "1094645", value = "Información del Instituto de Seguridad y Servicios Sociales.")
  public String getISSSTE() {
    return ISSSTE;
  }
  public void setISSSTE(String ISSSTE) {
    this.ISSSTE = ISSSTE;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lista lista = (Lista) o;
    return Objects.equals(this.nombre, lista.nombre) &&
        Objects.equals(this.apellidoPaterno, lista.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, lista.apellidoMaterno) &&
        Objects.equals(this.CURP, lista.CURP) &&
        Objects.equals(this.fechaNacimiento, lista.fechaNacimiento) &&
        Objects.equals(this.lista, lista.lista) &&
        Objects.equals(this.estatus, lista.estatus) &&
        Objects.equals(this.dependencia, lista.dependencia) &&
        Objects.equals(this.puesto, lista.puesto) &&
        Objects.equals(this.nivel, lista.nivel) &&
        Objects.equals(this.parentesco, lista.parentesco) &&
        Objects.equals(this.ISSSTE, lista.ISSSTE);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombre, apellidoPaterno, apellidoMaterno, CURP, fechaNacimiento, lista, estatus, dependencia, puesto, nivel, parentesco, ISSSTE);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lista {\n");
    
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    lista: ").append(toIndentedString(lista)).append("\n");
    sb.append("    estatus: ").append(toIndentedString(estatus)).append("\n");
    sb.append("    dependencia: ").append(toIndentedString(dependencia)).append("\n");
    sb.append("    puesto: ").append(toIndentedString(puesto)).append("\n");
    sb.append("    nivel: ").append(toIndentedString(nivel)).append("\n");
    sb.append("    parentesco: ").append(toIndentedString(parentesco)).append("\n");
    sb.append("    ISSSTE: ").append(toIndentedString(ISSSTE)).append("\n");
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
