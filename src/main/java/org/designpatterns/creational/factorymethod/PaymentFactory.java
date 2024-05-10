package org.designpatterns.creational.factorymethod;

public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment){
        return switch (typePayment){
            case CARD -> new CardPayment();
            case GOOGLE_PAY -> new GooglePayment();
        };
    }
}
