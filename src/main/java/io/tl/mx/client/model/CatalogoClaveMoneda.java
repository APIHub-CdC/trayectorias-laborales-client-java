package io.tl.mx.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoClaveMoneda.Adapter.class)
public enum CatalogoClaveMoneda {
  
  MXP("MXP"),
  
  USD("USD"),
  
  EUR("EUR");
  private String value;
  CatalogoClaveMoneda(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoClaveMoneda fromValue(String text) {
    for (CatalogoClaveMoneda b : CatalogoClaveMoneda.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoClaveMoneda> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoClaveMoneda enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoClaveMoneda read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoClaveMoneda.fromValue(String.valueOf(value));
    }
  }
}
