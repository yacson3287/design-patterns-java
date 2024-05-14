package org.designpatterns.behavioral.visitor;

public class BlackCreditCard implements CreditCardVisitor{
    @Override
    public void gasolineOffer(GasolineOffer gasolineOffer) {
        System.out.println("10% discount in gasoline with your black card");
    }

    @Override
    public void flightOffer(FlightOffer flightOffer) {
        System.out.println("15% discount in flight with your black card");
    }
}
