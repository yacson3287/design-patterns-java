package org.designpatterns.structural.bridge;

public abstract class CreditCard {

    protected ICreditCard card;

    protected CreditCard(ICreditCard iCreditCard){
        this.card = iCreditCard;
    }

    public abstract void pay();
}
