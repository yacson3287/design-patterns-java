package org.designpatterns.structural.bridge;

public class SecrureCreditCard implements ICreditCard {
    @Override
    public void pay() {
        System.out.println("payment did SECURE");
    }
}
