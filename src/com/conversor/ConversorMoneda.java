package com.conversor;

import com.conversor.HttpService;
import com.conversor.ApiResponse;
import com.google.gson.Gson;

public class ConversorMoneda {
  public void convertir(String monedaOrigen, String monedaDestino, double cantidad){
    try{

      HttpService http = new HttpService();
      String json = http.ObtenerJason(monedaOrigen, monedaDestino);

      Gson gson = new Gson();
      ApiResponse data = gson.fromJson(json, ApiResponse.class);

      double resultado = cantidad * data.conversion_rate();
      System.out.printf("%.2f %s = %.2f %s%n", cantidad, monedaOrigen, resultado, monedaDestino);

    }catch (Exception e){
      System.out.println("❌ Error en la conversión: " + e.getMessage());
    }
  }
}
