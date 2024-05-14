package org.designpatterns.structural.adapter;

public class CreditCard implements Payment {

    private static final String CLASSIC = "classic";
    private static final String BLACK = "black";
    private static final String GOLD = "gold";

    private Adapter adapter;

    @Override
    public void pay(String type) {
        switch (type) {
            case CLASSIC -> System.out.println("Card Classic: payment without any type to security");
            case BLACK -> {
                adapter = new Adapter(BLACK);
                adapter.pay(BLACK);
            }
            case GOLD -> {
                adapter = new Adapter(GOLD);
                adapter.pay(GOLD);
            }
            default -> System.out.println("the payment can't do, because not it's  recognize that card");
        }
    }
}
