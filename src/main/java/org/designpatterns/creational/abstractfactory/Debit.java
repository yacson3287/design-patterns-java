package org.designpatterns.creational.abstractfactory;

public class Debit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "pay to debit";
    }
}
