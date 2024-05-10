package org.designpatterns.creational.factorymethod;

public class GooglePayment implements Payment{
    @Override
    public String doPayment() {
        return "payment with google payment";
    }
}
