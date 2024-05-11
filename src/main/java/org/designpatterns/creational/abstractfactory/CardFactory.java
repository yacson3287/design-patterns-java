package org.designpatterns.creational.abstractfactory;

public class CardFactory implements AbstractFactory<Card>{

    private static final String VISA = "VISA";
    private static final String MASTERCARD = "MASTERCARD";

    @Override
    public Card create(String type) {
        return switch (type){
            case VISA -> new Visa();
            case MASTERCARD -> new MasterCard();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };

    }
}
