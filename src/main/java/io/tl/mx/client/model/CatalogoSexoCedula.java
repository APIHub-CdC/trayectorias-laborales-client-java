package io.tl.mx.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoSexoCedula.Adapter.class)
public enum CatalogoSexoCedula {
  
  NUMBER_1(1),
  
  NUMBER_2(2);
  private Integer value;
  CatalogoSexoCedula(Integer value) {
    this.value = value;
  }
  public Integer getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoSexoCedula fromValue(String text) {
    for (CatalogoSexoCedula b : CatalogoSexoCedula.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoSexoCedula> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoSexoCedula enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoSexoCedula read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CatalogoSexoCedula.fromValue(String.valueOf(value));
    }
  }
}
