package com.sajan.factorypattern;

import com.sajan.Payment;

public class CreditCardPayment implements Payment {
    public CreditCardPayment(){

    }

    @Override
    public String payment(int amount) {
        return "Payment with credit amount "+ amount;
    }
}
