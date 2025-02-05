package com.assignment.CurrencyConverter.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestBodyDTO {
    private String from;
    private String to;
    private double amount;

//    public void setTo(String to){
//        this.to = to;
//    }
//    public String getTo(){
//        return to;
//    }
}
