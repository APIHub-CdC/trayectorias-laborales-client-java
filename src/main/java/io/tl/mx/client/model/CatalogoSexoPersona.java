package io.tl.mx.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoSexoPersona.Adapter.class)
public enum CatalogoSexoPersona {
  
  F("F"),
  
  M("M");
  private String value;
  CatalogoSexoPersona(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoSexoPersona fromValue(String text) {
    for (CatalogoSexoPersona b : CatalogoSexoPersona.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoSexoPersona> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoSexoPersona enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoSexoPersona read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoSexoPersona.fromValue(String.valueOf(value));
    }
  }
}
