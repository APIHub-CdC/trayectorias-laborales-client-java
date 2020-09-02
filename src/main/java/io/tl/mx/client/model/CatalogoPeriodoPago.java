package io.tl.mx.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoPeriodoPago.Adapter.class)
public enum CatalogoPeriodoPago {
  
  S("S"),
  
  Q("Q"),
  
  M("M"),
  
  C("C");
  private String value;
  CatalogoPeriodoPago(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoPeriodoPago fromValue(String text) {
    for (CatalogoPeriodoPago b : CatalogoPeriodoPago.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoPeriodoPago> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoPeriodoPago enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoPeriodoPago read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoPeriodoPago.fromValue(String.valueOf(value));
    }
  }
}
