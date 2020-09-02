package io.tl.mx.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.tl.mx.client.model.Domicilio;

public class Consulta {
  @SerializedName("fecha")
  private String fecha = null;
  @SerializedName("tipoNegocio")
  private String tipoNegocio = null;
  @SerializedName("puestoSolicitado")
  private String puestoSolicitado = null;
  @SerializedName("domicilio")
  private Domicilio domicilio = null;
  public Consulta fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }
   
  @ApiModelProperty(example = "01/Ene/2020", value = "Fecha en que Círculo Laboral registró la consulta.")
  public String getFecha() {
    return fecha;
  }
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }
  public Consulta tipoNegocio(String tipoNegocio) {
    this.tipoNegocio = tipoNegocio;
    return this;
  }
   
  @ApiModelProperty(example = "Empresa", value = "Nombre del tipo de negocio de la empresa que consultó a la persona.")
  public String getTipoNegocio() {
    return tipoNegocio;
  }
  public void setTipoNegocio(String tipoNegocio) {
    this.tipoNegocio = tipoNegocio;
  }
  public Consulta puestoSolicitado(String puestoSolicitado) {
    this.puestoSolicitado = puestoSolicitado;
    return this;
  }
   
  @ApiModelProperty(example = "Desarrollador SR", value = "Indica el puesto solicitado.")
  public String getPuestoSolicitado() {
    return puestoSolicitado;
  }
  public void setPuestoSolicitado(String puestoSolicitado) {
    this.puestoSolicitado = puestoSolicitado;
  }
  public Consulta domicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Domicilio getDomicilio() {
    return domicilio;
  }
  public void setDomicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consulta consulta = (Consulta) o;
    return Objects.equals(this.fecha, consulta.fecha) &&
        Objects.equals(this.tipoNegocio, consulta.tipoNegocio) &&
        Objects.equals(this.puestoSolicitado, consulta.puestoSolicitado) &&
        Objects.equals(this.domicilio, consulta.domicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fecha, tipoNegocio, puestoSolicitado, domicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consulta {\n");
    
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    tipoNegocio: ").append(toIndentedString(tipoNegocio)).append("\n");
    sb.append("    puestoSolicitado: ").append(toIndentedString(puestoSolicitado)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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
