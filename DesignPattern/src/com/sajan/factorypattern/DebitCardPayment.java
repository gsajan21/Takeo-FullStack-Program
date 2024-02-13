package com.sajan.factorypattern;

import com.sajan.Payment;

public class DebitCardPayment implements Payment {
    public DebitCardPayment(){

    }
    @Override
    public String payment(int amount) {
        return "Payment with debit amount "+ amount;
    }
}
