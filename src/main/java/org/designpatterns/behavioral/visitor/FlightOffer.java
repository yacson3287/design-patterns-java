package org.designpatterns.behavioral.visitor;

public class FlightOffer implements ElementOffer{
    @Override
    public void accept(CreditCardVisitor creditCardVisitor) {
            creditCardVisitor.flightOffer(this);
    }
}
