package org.designpatterns.structural.bridge;

public class ClassicCreditCard extends CreditCard{

    public ClassicCreditCard(ICreditCard iCreditCard){
        super(iCreditCard);
    }

    @Override
    public void pay() {
        card.pay();
    }
}
