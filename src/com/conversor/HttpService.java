package com.conversor;

import  com.conversor.config;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpService {
  public String ObtenerJason(String monedaOrigen, String monedaDestino)throws IOException, InterruptedException {

    String apiKey = config.Config.get("API_KEY");
    String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"
            + monedaOrigen + "/" + monedaDestino;


    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();

    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    return response.body();
  }
}
