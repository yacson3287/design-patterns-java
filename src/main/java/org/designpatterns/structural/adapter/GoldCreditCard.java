package org.designpatterns.structural.adapter;

public class GoldCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {

    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Card Gold: payment with secure level Z");
    }
}
