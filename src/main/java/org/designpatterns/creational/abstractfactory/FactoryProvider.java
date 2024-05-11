package org.designpatterns.creational.abstractfactory;

public class FactoryProvider {

    private static final String CARD = "CARD";
    private static final String PAYMENT_METHOD = "PAYMENT_METHOD";

    public static AbstractFactory getFactory(String chooseFactory){
       return switch (chooseFactory){
           case CARD -> new CardFactory();
           case PAYMENT_METHOD -> new PaymentMethodFactory();
           default -> throw new IllegalStateException("Unexpected value: " + chooseFactory);
       };

    }
}
