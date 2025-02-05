package com.assignment.CurrencyConverter.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBodyDTO {
    private String from;
    private String to;
    private double amount;
    private double convertedAmount;
}
