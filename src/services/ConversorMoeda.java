package services;

import entities.TaxaMoeda;
import models.Moeda;

public class ConversorMoeda {

    public static Double converter(Double valor, Moeda de, Moeda para) {
        TaxaMoeda taxaMoeda = ConsultaTaxaCambio.buscarTaxas(de);
        double taxaConversao = taxaMoeda.getConversionRates().get(para.toString());
        return valor * taxaConversao;
    }
}
