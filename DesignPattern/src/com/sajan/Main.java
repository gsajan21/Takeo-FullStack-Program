package com.sajan;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Payment payment = factory.pay("credit");
        System.out.println(payment.payment(5000));

    }
}
