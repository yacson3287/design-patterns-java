package org.designpatterns.creational.factorymethod;

public class CardPayment implements Payment{
    @Override
    public String doPayment() {
        return "payment with credit card";
    }
}
