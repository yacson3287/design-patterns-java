package org.designpatterns.behavioral.templatemethod;

public class PaymentVisa extends Payment{
    @Override
    void initialize() {
        System.out.println("initialize payment with Visa");
    }

    @Override
    void startPayment() {
        System.out.println("start payment with Visa");
    }

    @Override
    void endPayment() {
        System.out.println("end payment with Visa");
    }
}
