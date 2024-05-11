package org.designpatterns.creational.abstractfactory;

public class Visa implements Card{
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "123456789 VISA";
    }
}
