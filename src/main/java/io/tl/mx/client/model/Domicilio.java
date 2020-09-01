package io.tl.mx.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.tl.mx.client.model.CatalogoEstado;
import io.tl.mx.client.model.CatalogoTipoDomicilio;

public class Domicilio {
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("colonia")
  private String colonia = null;
  @SerializedName("delegacion")
  private String delegacion = null;
  @SerializedName("ciudad")
  private String ciudad = null;
  @SerializedName("estado")
  private CatalogoEstado estado = null;
  @SerializedName("cp")
  private String cp = null;
  @SerializedName("fechaResidencia")
  private String fechaResidencia = null;
  @SerializedName("telefono")
  private String telefono = null;
  @SerializedName("telefonoCelular")
  private String telefonoCelular = null;
  @SerializedName("tipoDomicilio")
  private CatalogoTipoDomicilio tipoDomicilio = null;
  public Domicilio direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(example = "Calle 1", value = "Contempla nombre de la calle (Avenida, privada, manzana, lote), número exterior y número interior.")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public Domicilio colonia(String colonia) {
    this.colonia = colonia;
    return this;
  }
   
  @ApiModelProperty(example = "Fresnos", value = "Subdivisión de las alcaldías o municipios a la cual pertenece el domicilio de la persona consultada.")
  public String getColonia() {
    return colonia;
  }
  public void setColonia(String colonia) {
    this.colonia = colonia;
  }
  public Domicilio delegacion(String delegacion) {
    this.delegacion = delegacion;
    return this;
  }
   
  @ApiModelProperty(example = "Cuauhtemoc", value = "Subdivisión del estado a la cual pertenece el domicilio de la persona consultada.")
  public String getDelegacion() {
    return delegacion;
  }
  public void setDelegacion(String delegacion) {
    this.delegacion = delegacion;
  }
  public Domicilio ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
   
  @ApiModelProperty(example = "65644", value = "Ciudad a la cual pertenece el domicilio de la persona consultada.")
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public Domicilio estado(CatalogoEstado estado) {
    this.estado = estado;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoEstado getEstado() {
    return estado;
  }
  public void setEstado(CatalogoEstado estado) {
    this.estado = estado;
  }
  public Domicilio cp(String cp) {
    this.cp = cp;
    return this;
  }
   
  @ApiModelProperty(example = "54565", value = "Número asignado por Correos de México (antes Sepomex) a la población del domicio de la persona consultada.")
  public String getCp() {
    return cp;
  }
  public void setCp(String cp) {
    this.cp = cp;
  }
  public Domicilio fechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
    return this;
  }
   
  @ApiModelProperty(example = "09/Jun/2017", value = "Indica la fecha de residencia del domicilio.")
  public String getFechaResidencia() {
    return fechaResidencia;
  }
  public void setFechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
  }
  public Domicilio telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }
   
  @ApiModelProperty(example = "23456754", value = "Secuencia de dígitos utilizada para identificar la línea telefónica local de la persona consultada.")
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  public Domicilio telefonoCelular(String telefonoCelular) {
    this.telefonoCelular = telefonoCelular;
    return this;
  }
   
  @ApiModelProperty(example = "54098787", value = "Secuencia de dígitos utilizada para identificar la línea telefónica personal de la persona consultada.")
  public String getTelefonoCelular() {
    return telefonoCelular;
  }
  public void setTelefonoCelular(String telefonoCelular) {
    this.telefonoCelular = telefonoCelular;
  }
  public Domicilio tipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoTipoDomicilio getTipoDomicilio() {
    return tipoDomicilio;
  }
  public void setTipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domicilio domicilio = (Domicilio) o;
    return Objects.equals(this.direccion, domicilio.direccion) &&
        Objects.equals(this.colonia, domicilio.colonia) &&
        Objects.equals(this.delegacion, domicilio.delegacion) &&
        Objects.equals(this.ciudad, domicilio.ciudad) &&
        Objects.equals(this.estado, domicilio.estado) &&
        Objects.equals(this.cp, domicilio.cp) &&
        Objects.equals(this.fechaResidencia, domicilio.fechaResidencia) &&
        Objects.equals(this.telefono, domicilio.telefono) &&
        Objects.equals(this.telefonoCelular, domicilio.telefonoCelular) &&
        Objects.equals(this.tipoDomicilio, domicilio.tipoDomicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(direccion, colonia, delegacion, ciudad, estado, cp, fechaResidencia, telefono, telefonoCelular, tipoDomicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domicilio {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
    sb.append("    delegacion: ").append(toIndentedString(delegacion)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    cp: ").append(toIndentedString(cp)).append("\n");
    sb.append("    fechaResidencia: ").append(toIndentedString(fechaResidencia)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    telefonoCelular: ").append(toIndentedString(telefonoCelular)).append("\n");
    sb.append("    tipoDomicilio: ").append(toIndentedString(tipoDomicilio)).append("\n");
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
