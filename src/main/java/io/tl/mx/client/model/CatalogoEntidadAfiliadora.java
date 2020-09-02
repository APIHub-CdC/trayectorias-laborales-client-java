package io.tl.mx.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoEntidadAfiliadora.Adapter.class)
public enum CatalogoEntidadAfiliadora {
  
  IM("IM"),
  
  IS("IS"),
  
  SP("SP");
  private String value;
  CatalogoEntidadAfiliadora(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoEntidadAfiliadora fromValue(String text) {
    for (CatalogoEntidadAfiliadora b : CatalogoEntidadAfiliadora.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoEntidadAfiliadora> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoEntidadAfiliadora enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoEntidadAfiliadora read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoEntidadAfiliadora.fromValue(String.valueOf(value));
    }
  }
}
