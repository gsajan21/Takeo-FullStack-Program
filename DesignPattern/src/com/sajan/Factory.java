package com.sajan;

import com.sajan.factorypattern.CreditCardPayment;
import com.sajan.factorypattern.DebitCardPayment;
import com.sajan.factorypattern.UniPayment;

public class Factory {
    public Payment pay(String paymentType){

        switch(paymentType){
            case"credit":
                return  new CreditCardPayment();
            case "debit":
                return new DebitCardPayment();
            case "uni":
                return new UniPayment();
            default:
                throw new IllegalArgumentException("Please choose the correct option to make a payment");
        }
    }
}
