package org.designpatterns.structural.adapter;

public class BlackCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        System.out.println("Card Black payment with secure level A");
    }

    @Override
    public void payWithSecureLevelZ() {

    }
}
