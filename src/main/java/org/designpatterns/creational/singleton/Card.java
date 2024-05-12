package org.designpatterns.creational.singleton;

public class Card {

    private static Card INSTANCE;

    private String number;

    private Card() {

    }

    public synchronized static Card getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Card();
        }
        return INSTANCE;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
