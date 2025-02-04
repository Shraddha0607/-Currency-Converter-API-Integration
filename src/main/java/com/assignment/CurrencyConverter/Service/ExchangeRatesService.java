package com.assignment.CurrencyConverter.Service;

import com.assignment.CurrencyConverter.DTO.RequestBody;
import com.assignment.CurrencyConverter.DTO.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExchangeRatesService {

    private final String apiUrl = "https://openexchangerates.org/api/latest.json";
    private final String apiKey = "558fa22183674674980bd4162345ebea";

    @Autowired
    private RestTemplate restTemplate;

    public double getExchangeRates(String currencyId){
        double exchangedRate = restTemplate.getForObject(apiUrl, );
        return exchangedRate;
    }

    // other service method, to change the other currency
    public ResponseBody convertCurrencyToOther(RequestBody request){
        String fullUrl = apiUrl + "?app_id=" + apiKey;

        // get the response by fetching from get call from api
        ResponseEntity<ConversionResponse> conversionResponse= restTemplate.exchange(apiUrl, HttpMethod.GET,null, ConversionResponse.class);

        // here need to fetch exchange rate of "from" and "to"
        // then apply logic
        // and generate converted amount
        double convertedValue = getConverted(request, conversionResponse);

        // create the object of response to return
        ResponseBody response = new ResponseBody();
        response.setTo(request.getTo());
        response.setFrom(request.getFrom());
        response.setAmount(request.getAmount());
        response.setConvertedAmount(convertedValue);

        return  response;
    }

    private ConversionResponse getConverted(RequestBody request, ConversionResponse conversionResponse){

    }


}

