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



public class DomicilioConsulta {
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("colonia")
  private String colonia = null;
  @SerializedName("cp")
  private String cp = null;
  public DomicilioConsulta direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(example = "Calle 1", required = true, value = "Contempla nombre de la calle (Avenida, privada, manzana, lote), número exterior y número interior.")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public DomicilioConsulta colonia(String colonia) {
    this.colonia = colonia;
    return this;
  }
   
  @ApiModelProperty(example = "Fresnos", required = true, value = "Subdivisión de las alcaldías o municipios a la cual pertenece el domicilio de la persona consultada.")
  public String getColonia() {
    return colonia;
  }
  public void setColonia(String colonia) {
    this.colonia = colonia;
  }
  public DomicilioConsulta cp(String cp) {
    this.cp = cp;
    return this;
  }
   
  @ApiModelProperty(example = "54565", required = true, value = "Número asignado por Correos de México (antes Sepomex) a la población del domicio de la persona consultada.")
  public String getCp() {
    return cp;
  }
  public void setCp(String cp) {
    this.cp = cp;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomicilioConsulta domicilioConsulta = (DomicilioConsulta) o;
    return Objects.equals(this.direccion, domicilioConsulta.direccion) &&
        Objects.equals(this.colonia, domicilioConsulta.colonia) &&
        Objects.equals(this.cp, domicilioConsulta.cp);
  }
  @Override
  public int hashCode() {
    return Objects.hash(direccion, colonia, cp);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomicilioConsulta {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
    sb.append("    cp: ").append(toIndentedString(cp)).append("\n");
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
