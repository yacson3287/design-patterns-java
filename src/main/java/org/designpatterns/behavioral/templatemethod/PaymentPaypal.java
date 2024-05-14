package org.designpatterns.behavioral.templatemethod;

public class PaymentPaypal extends Payment{

    @Override
    void initialize() {
        System.out.println("initialize payment with Paypal");
    }

    @Override
    void startPayment() {
        System.out.println("start payment with Paypal");
    }

    @Override
    void endPayment() {
        System.out.println("end payment with Paypal");
    }
}
