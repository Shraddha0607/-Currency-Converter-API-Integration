package com.assignment.CurrencyConverter.Service;

import com.assignment.CurrencyConverter.DTO.ExchangeResponse;
import com.assignment.CurrencyConverter.DTO.RequestBodyDTO;
import com.assignment.CurrencyConverter.DTO.ResponseBodyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExchangeRatesService {

    private final String apiUrl = "https://openexchangerates.org/api/latest.json";
    private final String apiKey = "558fa22183674674980bd4162345ebea";

    @Autowired
    private RestTemplate restTemplate;

    public ExchangeResponse getExchangeRates() {
        String fullUrl = apiUrl + "?app_id=" + apiKey;
        ResponseEntity<ExchangeResponse> exchangedResponse = restTemplate.exchange(fullUrl, HttpMethod.GET, null, ExchangeResponse.class);
        return exchangedResponse.getBody();
    }

    // other service method, to change the other currency
    public ResponseBodyDTO convertCurrencyToOther(RequestBodyDTO request) {

        // get the response by fetching from get call from api
        ExchangeResponse exchangeResponse = getExchangeRates();

        // here need to fetch exchange rate of "from" and "to"
        // then apply logic
        // and generate converted amount
        double convertedValue = getConverted(request, exchangeResponse);

        // create the object of response to return
        ResponseBodyDTO response = new ResponseBodyDTO();
        response.setTo(request.getTo());
        response.setFrom(request.getFrom());
        response.setAmount(request.getAmount());
        response.setConvertedAmount(convertedValue);

        return response;
    }

    private double getConverted(RequestBodyDTO request, ExchangeResponse exchangeResponse) {
        String toCurrency = request.getTo();
        String fromCurrency = request.getFrom();

        // Get the 'Rates' object from the response
        ExchangeResponse.Rates rates = exchangeResponse.getRates();

        double toExchangeRate = getExchangeRate(rates, toCurrency);
        double fromExchangeRate = getExchangeRate(rates, fromCurrency);
        System.out.println(toExchangeRate + " " +  fromExchangeRate +" are the rates of exchange");

        // Perform the conversion
        if (toExchangeRate == 0 || fromExchangeRate == 0) {
            // Handle error if any exchange rate is 0
            return 0.0;
        }

        // Convert the amount
        double convertedAmount = (request.getAmount() * fromExchangeRate) / toExchangeRate;

        return convertedAmount;
    }

    private double getExchangeRate(ExchangeResponse.Rates rates, String currency) {
        // Use reflection to dynamically get the value based on currency code
        try {
            // Get the field (currency code) dynamically using reflection
            java.lang.reflect.Field field = ExchangeResponse.Rates.class.getDeclaredField(currency);
            field.setAccessible(true);  // Make the field accessible
            return (double) field.get(rates);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            // Handle case where the field is not found or not accessible
            e.printStackTrace();
            return 0.0;
        }
    }


}

