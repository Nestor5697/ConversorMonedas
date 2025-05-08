package com.conversor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class config {

  public class Config {
    private static final Properties properties = new Properties();

    static {
      try {
        properties.load(new FileInputStream("src/config.properties"));
      } catch (IOException e) {
        System.out.println("❌ No se pudo cargar config.properties: " + e.getMessage());
      }
    }

    public static String get(String key) {
      return properties.getProperty(key);
    }
  }

}
