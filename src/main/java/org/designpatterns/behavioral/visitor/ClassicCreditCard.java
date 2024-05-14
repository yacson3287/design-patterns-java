package org.designpatterns.behavioral.visitor;

public class ClassicCreditCard implements CreditCardVisitor{
    @Override
    public void gasolineOffer(GasolineOffer gasolineOffer) {
        System.out.println("3% discount in gasoline with your classic card");
    }

    @Override
    public void flightOffer(FlightOffer flightOffer) {
        System.out.println("3% discount in flight with your classic card");
    }
}
