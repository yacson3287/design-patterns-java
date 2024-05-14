package org.designpatterns.behavioral.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VisitorTest {

    ElementOffer gasoline;
    ElementOffer flight;

    @BeforeEach
    void setUp() {
        gasoline = new GasolineOffer();
        flight = new FlightOffer();
    }

    @Test
    public void classicCreditCardVisitorTest() {
        gasoline.accept(new ClassicCreditCard());
        flight.accept(new ClassicCreditCard());
    }

    @Test
    public void blackCreditCardVisitorTest() {
        gasoline.accept(new BlackCreditCard());
        flight.accept(new BlackCreditCard());
    }
}