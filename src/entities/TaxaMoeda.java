package entities;

import java.util.Map;

public class TaxaMoeda {
    private String result;
    private String base_code;
    private Map<String, Double> conversion_rates;

    public TaxaMoeda(String result, String base_code, Map<String, Double> conversion_rates) {
        this.result = result;
        this.base_code = base_code;
        this.conversion_rates = conversion_rates;
    }

    public String getResult() {
        return result;
    }

    public String getBaseCode() {
        return base_code;
    }

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }

    @Override
    public String toString() {
        return "TaxaDeCambio{" +
                "result='" + result + '\'' +
                ", base_code='" + base_code + '\'' +
                ", conversion_rates=" + conversion_rates +
                '}';
    }
}
