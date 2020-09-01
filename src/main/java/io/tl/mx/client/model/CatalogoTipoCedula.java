package io.tl.mx.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoTipoCedula.Adapter.class)
public enum CatalogoTipoCedula {
  
  C1("C1"),
  
  A1("A1");
  private String value;
  CatalogoTipoCedula(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoTipoCedula fromValue(String text) {
    for (CatalogoTipoCedula b : CatalogoTipoCedula.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoTipoCedula> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoCedula enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoTipoCedula read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoTipoCedula.fromValue(String.valueOf(value));
    }
  }
}
