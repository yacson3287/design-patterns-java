package org.designpatterns.creational.abstractfactory;

public class Credit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "pay to credit";
    }
}
