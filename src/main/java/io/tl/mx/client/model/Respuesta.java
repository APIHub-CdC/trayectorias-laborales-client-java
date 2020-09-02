package io.tl.mx.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.tl.mx.client.model.Cedula;
import io.tl.mx.client.model.Consulta;
import io.tl.mx.client.model.Empleo;
import io.tl.mx.client.model.Encabezado;
import io.tl.mx.client.model.Lista;
import io.tl.mx.client.model.Persona;
import java.util.ArrayList;
import java.util.List;

public class Respuesta {
  @SerializedName("encabezado")
  private Encabezado encabezado = null;
  @SerializedName("persona")
  private Persona persona = null;
  @SerializedName("empleos")
  private List<Empleo> empleos = null;
  @SerializedName("consultas")
  private List<Consulta> consultas = null;
  @SerializedName("cedulas")
  private List<Cedula> cedulas = null;
  @SerializedName("listaPld")
  private List<Lista> listaPld = null;
  @SerializedName("listaPep")
  private List<Lista> listaPep = null;
  @SerializedName("listaOtra")
  private List<Lista> listaOtra = null;
  public Respuesta encabezado(Encabezado encabezado) {
    this.encabezado = encabezado;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Encabezado getEncabezado() {
    return encabezado;
  }
  public void setEncabezado(Encabezado encabezado) {
    this.encabezado = encabezado;
  }
  public Respuesta persona(Persona persona) {
    this.persona = persona;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Persona getPersona() {
    return persona;
  }
  public void setPersona(Persona persona) {
    this.persona = persona;
  }
  public Respuesta empleos(List<Empleo> empleos) {
    this.empleos = empleos;
    return this;
  }
  public Respuesta addEmpleosItem(Empleo empleosItem) {
    if (this.empleos == null) {
      this.empleos = new ArrayList<Empleo>();
    }
    this.empleos.add(empleosItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Empleo> getEmpleos() {
    return empleos;
  }
  public void setEmpleos(List<Empleo> empleos) {
    this.empleos = empleos;
  }
  public Respuesta consultas(List<Consulta> consultas) {
    this.consultas = consultas;
    return this;
  }
  public Respuesta addConsultasItem(Consulta consultasItem) {
    if (this.consultas == null) {
      this.consultas = new ArrayList<Consulta>();
    }
    this.consultas.add(consultasItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Consulta> getConsultas() {
    return consultas;
  }
  public void setConsultas(List<Consulta> consultas) {
    this.consultas = consultas;
  }
  public Respuesta cedulas(List<Cedula> cedulas) {
    this.cedulas = cedulas;
    return this;
  }
  public Respuesta addCedulasItem(Cedula cedulasItem) {
    if (this.cedulas == null) {
      this.cedulas = new ArrayList<Cedula>();
    }
    this.cedulas.add(cedulasItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Cedula> getCedulas() {
    return cedulas;
  }
  public void setCedulas(List<Cedula> cedulas) {
    this.cedulas = cedulas;
  }
  public Respuesta listaPld(List<Lista> listaPld) {
    this.listaPld = listaPld;
    return this;
  }
  public Respuesta addListaPldItem(Lista listaPldItem) {
    if (this.listaPld == null) {
      this.listaPld = new ArrayList<Lista>();
    }
    this.listaPld.add(listaPldItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Lista> getListaPld() {
    return listaPld;
  }
  public void setListaPld(List<Lista> listaPld) {
    this.listaPld = listaPld;
  }
  public Respuesta listaPep(List<Lista> listaPep) {
    this.listaPep = listaPep;
    return this;
  }
  public Respuesta addListaPepItem(Lista listaPepItem) {
    if (this.listaPep == null) {
      this.listaPep = new ArrayList<Lista>();
    }
    this.listaPep.add(listaPepItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Lista> getListaPep() {
    return listaPep;
  }
  public void setListaPep(List<Lista> listaPep) {
    this.listaPep = listaPep;
  }
  public Respuesta listaOtra(List<Lista> listaOtra) {
    this.listaOtra = listaOtra;
    return this;
  }
  public Respuesta addListaOtraItem(Lista listaOtraItem) {
    if (this.listaOtra == null) {
      this.listaOtra = new ArrayList<Lista>();
    }
    this.listaOtra.add(listaOtraItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Lista> getListaOtra() {
    return listaOtra;
  }
  public void setListaOtra(List<Lista> listaOtra) {
    this.listaOtra = listaOtra;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.encabezado, respuesta.encabezado) &&
        Objects.equals(this.persona, respuesta.persona) &&
        Objects.equals(this.empleos, respuesta.empleos) &&
        Objects.equals(this.consultas, respuesta.consultas) &&
        Objects.equals(this.cedulas, respuesta.cedulas) &&
        Objects.equals(this.listaPld, respuesta.listaPld) &&
        Objects.equals(this.listaPep, respuesta.listaPep) &&
        Objects.equals(this.listaOtra, respuesta.listaOtra);
  }
  @Override
  public int hashCode() {
    return Objects.hash(encabezado, persona, empleos, consultas, cedulas, listaPld, listaPep, listaOtra);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    encabezado: ").append(toIndentedString(encabezado)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    empleos: ").append(toIndentedString(empleos)).append("\n");
    sb.append("    consultas: ").append(toIndentedString(consultas)).append("\n");
    sb.append("    cedulas: ").append(toIndentedString(cedulas)).append("\n");
    sb.append("    listaPld: ").append(toIndentedString(listaPld)).append("\n");
    sb.append("    listaPep: ").append(toIndentedString(listaPep)).append("\n");
    sb.append("    listaOtra: ").append(toIndentedString(listaOtra)).append("\n");
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
