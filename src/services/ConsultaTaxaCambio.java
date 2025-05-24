package services;

import com.google.gson.Gson;
import entities.TaxaMoeda;
import models.Moeda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTaxaCambio {

    public static TaxaMoeda buscarTaxas(Moeda moeda) {
        URI taxaDeCambio = URI.create("https://v6.exchangerate-api.com/v6/3c697ab8c2eb343ac39aa7a8/latest/" + moeda.toString());

        HttpRequest request = HttpRequest.newBuilder()
                .uri(taxaDeCambio)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TaxaMoeda.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir do cep!");
        }
    }
}
