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
import io.tl.mx.client.model.CatalogoClaveMoneda;
import io.tl.mx.client.model.CatalogoObservaciones;
import io.tl.mx.client.model.CatalogoPeriodoPago;
import io.tl.mx.client.model.Domicilio;
import java.io.IOException;
import java.math.BigDecimal;



public class Empleo {
  @SerializedName("referenciaEmpresa")
  private BigDecimal referenciaEmpresa = null;
  @SerializedName("tipoNegocioEmpresa")
  private String tipoNegocioEmpresa = null;
  @SerializedName("fechaContratacion")
  private String fechaContratacion = null;
  @SerializedName("fechaSalida")
  private String fechaSalida = null;
  @SerializedName("puesto")
  private String puesto = null;
  @SerializedName("ultimoSalario")
  private BigDecimal ultimoSalario = null;
  @SerializedName("periodoPago")
  private CatalogoPeriodoPago periodoPago = null;
  @SerializedName("claveMoneda")
  private CatalogoClaveMoneda claveMoneda = null;
  @SerializedName("domicilio")
  private Domicilio domicilio = null;
  @SerializedName("observaciones")
  private CatalogoObservaciones observaciones = null;
  public Empleo referenciaEmpresa(BigDecimal referenciaEmpresa) {
    this.referenciaEmpresa = referenciaEmpresa;
    return this;
  }
   
  @ApiModelProperty(example = "765.0", value = "Clave interna de la empresa en que laboró el sujeto investigado.")
  public BigDecimal getReferenciaEmpresa() {
    return referenciaEmpresa;
  }
  public void setReferenciaEmpresa(BigDecimal referenciaEmpresa) {
    this.referenciaEmpresa = referenciaEmpresa;
  }
  public Empleo tipoNegocioEmpresa(String tipoNegocioEmpresa) {
    this.tipoNegocioEmpresa = tipoNegocioEmpresa;
    return this;
  }
   
  @ApiModelProperty(example = "Buro Credito", value = "Tipo de negocio o giro de la empresa donde laboró la persona consultada.")
  public String getTipoNegocioEmpresa() {
    return tipoNegocioEmpresa;
  }
  public void setTipoNegocioEmpresa(String tipoNegocioEmpresa) {
    this.tipoNegocioEmpresa = tipoNegocioEmpresa;
  }
  public Empleo fechaContratacion(String fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
    return this;
  }
   
  @ApiModelProperty(example = "08/Ago/2020", value = "Fecha en que se contrató a la persona consultada en la empresa que reporta.")
  public String getFechaContratacion() {
    return fechaContratacion;
  }
  public void setFechaContratacion(String fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
  }
  public Empleo fechaSalida(String fechaSalida) {
    this.fechaSalida = fechaSalida;
    return this;
  }
   
  @ApiModelProperty(example = "30/Ago/2020", value = "Fecha en la que la persona consultada deja de trabajar en la empresa.")
  public String getFechaSalida() {
    return fechaSalida;
  }
  public void setFechaSalida(String fechaSalida) {
    this.fechaSalida = fechaSalida;
  }
  public Empleo puesto(String puesto) {
    this.puesto = puesto;
    return this;
  }
   
  @ApiModelProperty(example = "Desarrollador", value = "Puesto que la persona desempeñó en la empresa.")
  public String getPuesto() {
    return puesto;
  }
  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }
  public Empleo ultimoSalario(BigDecimal ultimoSalario) {
    this.ultimoSalario = ultimoSalario;
    return this;
  }
   
  @ApiModelProperty(example = "2000.0", value = "Último salario de la persona consultada.")
  public BigDecimal getUltimoSalario() {
    return ultimoSalario;
  }
  public void setUltimoSalario(BigDecimal ultimoSalario) {
    this.ultimoSalario = ultimoSalario;
  }
  public Empleo periodoPago(CatalogoPeriodoPago periodoPago) {
    this.periodoPago = periodoPago;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoPeriodoPago getPeriodoPago() {
    return periodoPago;
  }
  public void setPeriodoPago(CatalogoPeriodoPago periodoPago) {
    this.periodoPago = periodoPago;
  }
  public Empleo claveMoneda(CatalogoClaveMoneda claveMoneda) {
    this.claveMoneda = claveMoneda;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoClaveMoneda getClaveMoneda() {
    return claveMoneda;
  }
  public void setClaveMoneda(CatalogoClaveMoneda claveMoneda) {
    this.claveMoneda = claveMoneda;
  }
  public Empleo domicilio(Domicilio domicilio) {
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
  public Empleo observaciones(CatalogoObservaciones observaciones) {
    this.observaciones = observaciones;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoObservaciones getObservaciones() {
    return observaciones;
  }
  public void setObservaciones(CatalogoObservaciones observaciones) {
    this.observaciones = observaciones;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Empleo empleo = (Empleo) o;
    return Objects.equals(this.referenciaEmpresa, empleo.referenciaEmpresa) &&
        Objects.equals(this.tipoNegocioEmpresa, empleo.tipoNegocioEmpresa) &&
        Objects.equals(this.fechaContratacion, empleo.fechaContratacion) &&
        Objects.equals(this.fechaSalida, empleo.fechaSalida) &&
        Objects.equals(this.puesto, empleo.puesto) &&
        Objects.equals(this.ultimoSalario, empleo.ultimoSalario) &&
        Objects.equals(this.periodoPago, empleo.periodoPago) &&
        Objects.equals(this.claveMoneda, empleo.claveMoneda) &&
        Objects.equals(this.domicilio, empleo.domicilio) &&
        Objects.equals(this.observaciones, empleo.observaciones);
  }
  @Override
  public int hashCode() {
    return Objects.hash(referenciaEmpresa, tipoNegocioEmpresa, fechaContratacion, fechaSalida, puesto, ultimoSalario, periodoPago, claveMoneda, domicilio, observaciones);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empleo {\n");
    
    sb.append("    referenciaEmpresa: ").append(toIndentedString(referenciaEmpresa)).append("\n");
    sb.append("    tipoNegocioEmpresa: ").append(toIndentedString(tipoNegocioEmpresa)).append("\n");
    sb.append("    fechaContratacion: ").append(toIndentedString(fechaContratacion)).append("\n");
    sb.append("    fechaSalida: ").append(toIndentedString(fechaSalida)).append("\n");
    sb.append("    puesto: ").append(toIndentedString(puesto)).append("\n");
    sb.append("    ultimoSalario: ").append(toIndentedString(ultimoSalario)).append("\n");
    sb.append("    periodoPago: ").append(toIndentedString(periodoPago)).append("\n");
    sb.append("    claveMoneda: ").append(toIndentedString(claveMoneda)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    observaciones: ").append(toIndentedString(observaciones)).append("\n");
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
