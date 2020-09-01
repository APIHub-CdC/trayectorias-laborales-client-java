package io.tl.mx.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;



public class Encabezado {
  @SerializedName("claveEmpresaConsulta")
  private String claveEmpresaConsulta = null;
  @SerializedName("folioConsultaEmpleador")
  private String folioConsultaEmpleador = null;
  @SerializedName("expedienteEncontrado")
  private BigDecimal expedienteEncontrado = null;
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  @SerializedName("productoRequerido")
  private BigDecimal productoRequerido = null;
  @SerializedName("fechaEmision")
  private String fechaEmision = null;
  public Encabezado claveEmpresaConsulta(String claveEmpresaConsulta) {
    this.claveEmpresaConsulta = claveEmpresaConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "65644", value = "Clave proporcionada por CL para identificar la empresa que realiza la consulta.")
  public String getClaveEmpresaConsulta() {
    return claveEmpresaConsulta;
  }
  public void setClaveEmpresaConsulta(String claveEmpresaConsulta) {
    this.claveEmpresaConsulta = claveEmpresaConsulta;
  }
  public Encabezado folioConsultaEmpleador(String folioConsultaEmpleador) {
    this.folioConsultaEmpleador = folioConsultaEmpleador;
    return this;
  }
   
  @ApiModelProperty(example = "233435", value = "Folio enviado por la empresa  para identificar su consulta.")
  public String getFolioConsultaEmpleador() {
    return folioConsultaEmpleador;
  }
  public void setFolioConsultaEmpleador(String folioConsultaEmpleador) {
    this.folioConsultaEmpleador = folioConsultaEmpleador;
  }
  public Encabezado expedienteEncontrado(BigDecimal expedienteEncontrado) {
    this.expedienteEncontrado = expedienteEncontrado;
    return this;
  }
   
  @ApiModelProperty(example = "1.0", value = "Indica el numero de registros encontrados")
  public BigDecimal getExpedienteEncontrado() {
    return expedienteEncontrado;
  }
  public void setExpedienteEncontrado(BigDecimal expedienteEncontrado) {
    this.expedienteEncontrado = expedienteEncontrado;
  }
  public Encabezado folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "65644", value = "Número signado por Círculo Laboral para identificar una Consulta realizada.")
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  public Encabezado productoRequerido(BigDecimal productoRequerido) {
    this.productoRequerido = productoRequerido;
    return this;
  }
   
  @ApiModelProperty(example = "4.0", value = "Número de producto solicitado.")
  public BigDecimal getProductoRequerido() {
    return productoRequerido;
  }
  public void setProductoRequerido(BigDecimal productoRequerido) {
    this.productoRequerido = productoRequerido;
  }
  public Encabezado fechaEmision(String fechaEmision) {
    this.fechaEmision = fechaEmision;
    return this;
  }
   
  @ApiModelProperty(example = "10/Jul/2020", value = "Fecha en la que se efectuo la consulta.")
  public String getFechaEmision() {
    return fechaEmision;
  }
  public void setFechaEmision(String fechaEmision) {
    this.fechaEmision = fechaEmision;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Encabezado encabezado = (Encabezado) o;
    return Objects.equals(this.claveEmpresaConsulta, encabezado.claveEmpresaConsulta) &&
        Objects.equals(this.folioConsultaEmpleador, encabezado.folioConsultaEmpleador) &&
        Objects.equals(this.expedienteEncontrado, encabezado.expedienteEncontrado) &&
        Objects.equals(this.folioConsulta, encabezado.folioConsulta) &&
        Objects.equals(this.productoRequerido, encabezado.productoRequerido) &&
        Objects.equals(this.fechaEmision, encabezado.fechaEmision);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveEmpresaConsulta, folioConsultaEmpleador, expedienteEncontrado, folioConsulta, productoRequerido, fechaEmision);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Encabezado {\n");
    
    sb.append("    claveEmpresaConsulta: ").append(toIndentedString(claveEmpresaConsulta)).append("\n");
    sb.append("    folioConsultaEmpleador: ").append(toIndentedString(folioConsultaEmpleador)).append("\n");
    sb.append("    expedienteEncontrado: ").append(toIndentedString(expedienteEncontrado)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
    sb.append("    productoRequerido: ").append(toIndentedString(productoRequerido)).append("\n");
    sb.append("    fechaEmision: ").append(toIndentedString(fechaEmision)).append("\n");
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
