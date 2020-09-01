package io.tl.mx.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoNacionalidad.Adapter.class)
public enum CatalogoNacionalidad {
  
  EU("EU"),
  
  CR("CR"),
  
  CA("CA"),
  
  CB("CB"),
  
  MX("MX"),
  
  PR("PR"),
  
  CM("CM"),
  
  GT("GT"),
  
  AR("AR"),
  
  CH("CH"),
  
  BR("BR"),
  
  EC("EC"),
  
  VZ("VZ"),
  
  EP("EP"),
  
  IT("IT"),
  
  FR("FR"),
  
  RS("RS"),
  
  AL("AL"),
  
  BG("BG"),
  
  JP("JP"),
  
  CN("CN"),
  
  LV("LV"),
  
  LT("LT"),
  
  LU("LU"),
  
  UY("UY"),
  
  VN("VN"),
  
  ZR("ZR"),
  
  ZM("ZM"),
  
  ZW("ZW"),
  
  RO("RO"),
  
  SN("SN"),
  
  SY("SY"),
  
  SE("SE"),
  
  SW("SW"),
  
  SR("SR"),
  
  SZ("SZ"),
  
  TH("TH"),
  
  TW("TW"),
  
  TR("TR"),
  
  PM("PM"),
  
  PY("PY"),
  
  PL("PL"),
  
  FP("FP"),
  
  UK("UK"),
  
  UA("UA"),
  
  DO("DO"),
  
  CS("CS"),
  
  VC("VC"),
  
  DF("DF"),
  
  EG("EG"),
  
  SV("SV"),
  
  IB("IB"),
  
  IF("IF"),
  
  IR("IR"),
  
  IQ("IQ"),
  
  IE("IE"),
  
  HA("HA"),
  
  IG("IG"),
  
  GR("GR");
  private String value;
  CatalogoNacionalidad(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoNacionalidad fromValue(String text) {
    for (CatalogoNacionalidad b : CatalogoNacionalidad.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoNacionalidad> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoNacionalidad enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoNacionalidad read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoNacionalidad.fromValue(String.valueOf(value));
    }
  }
}
