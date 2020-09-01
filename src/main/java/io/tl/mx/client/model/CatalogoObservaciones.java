package io.tl.mx.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoObservaciones.Adapter.class)
public enum CatalogoObservaciones {
  
  N01("N01"),
  
  R01("R01"),
  
  A01("A01");
  private String value;
  CatalogoObservaciones(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoObservaciones fromValue(String text) {
    for (CatalogoObservaciones b : CatalogoObservaciones.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoObservaciones> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoObservaciones enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoObservaciones read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoObservaciones.fromValue(String.valueOf(value));
    }
  }
}
