package com.sajan.factorypattern;

import com.sajan.Payment;

public class UniPayment implements Payment {
    public UniPayment(){

    }
    @Override
    public String payment(int amount) {
        return "Payment with unipay amount "+ amount;
    }
}
