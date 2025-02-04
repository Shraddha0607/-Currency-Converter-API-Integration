package com.assignment.CurrencyConverter.Controller;

import com.assignment.CurrencyConverter.DTO.RequestBodyDTO;
import com.assignment.CurrencyConverter.DTO.ResponseBodyDTO;
import com.assignment.CurrencyConverter.Service.ExchangeRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExchangeRatesController {
    @Autowired
    ExchangeRatesService exchangeService;

//    @GetMapping("/rates")
//    public ResponseEntity<double> getExchangeRates(String currencyId){
//
//        // here first, need to call service method to get exchange rates
//        double exchangedRate = exchangeService.getExchangeRates(Id);
//
//        return new ResponseEntity<double>(exchangedRate, HttpStatusCode.OK);
//    }

    @PostMapping("/convert")
    public ResponseBodyDTO convertCurrencyToOther(@RequestBody RequestBodyDTO requestBodyDTO){

        // again need to call service class, to apply logic to convert
        System.out.println(requestBodyDTO.getTo() + " ");
        ResponseBodyDTO response = exchangeService.convertCurrencyToOther(requestBodyDTO);
        return response;
    }
}


//GET /api/rates?base=USD
//Fetch the exchange rates for the given base currency. Default base should
//be USD if not provided.
//b. POST /api/convert
//Convert an amount from one currency to another using the fetched
//exchange rates.