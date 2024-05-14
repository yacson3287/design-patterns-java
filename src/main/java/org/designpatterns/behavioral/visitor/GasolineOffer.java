package org.designpatterns.behavioral.visitor;

public class GasolineOffer implements ElementOffer{

    @Override
    public void accept(CreditCardVisitor creditCardVisitor) {
        creditCardVisitor.gasolineOffer(this);
    }
}
