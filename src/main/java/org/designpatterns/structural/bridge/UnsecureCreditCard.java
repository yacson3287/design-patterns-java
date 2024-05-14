package org.designpatterns.structural.bridge;

public class UnsecureCreditCard implements ICreditCard {

    @Override
    public void pay() {
        System.out.println("payment did NOT SECURE");
    }
}
