package com.springhow.designpatterns.facade;

public class PaymentService {

    public boolean takePayment(String cardDetails) {
        return cardDetails.length() == 16;
    }
}
