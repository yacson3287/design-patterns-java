package org.designpatterns.structural.adapter;

public class Adapter implements Payment{

    Secure secureCreditCard;

    private static final String BLACK = "black";
    private static final String GOLD = "gold";

    public Adapter(String type){
        switch (type){
            case BLACK -> secureCreditCard = new BlackCreditCard();
            case GOLD -> secureCreditCard = new GoldCreditCard();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    @Override
    public void pay(String type) {
        switch (type){
            case BLACK -> secureCreditCard.payWithSecureLevelA();
            case GOLD -> secureCreditCard.payWithSecureLevelZ();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
