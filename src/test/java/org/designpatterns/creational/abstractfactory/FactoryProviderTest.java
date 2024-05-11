package org.designpatterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryProviderTest {

    @Test
    public void Should_card_type_VISA(){
        var abstractFactory = FactoryProvider.getFactory("CARD");
        var card = (Card)abstractFactory.create("VISA");
        assertEquals("VISA",card.getCardType());
    }

    @Test
    public void Should_card_type_MASTERCARD(){
        var abstractFactory = FactoryProvider.getFactory("CARD");
        var card = (Card)abstractFactory.create("MASTERCARD");
        assertEquals("MASTERCARD",card.getCardType());
    }

    @Test
    public void Should_payment_method_type_Credit(){
        var abstractFactory = FactoryProvider.getFactory("PAYMENT_METHOD");
        var paymentMethod = (PaymentMethod)abstractFactory.create ("CREDIT");
        assertEquals("pay to credit",paymentMethod.doPayment());
    }

    @Test
    public void Should_payment_method_type_Debit(){
        var abstractFactory = FactoryProvider.getFactory("PAYMENT_METHOD");
        var paymentMethod = (PaymentMethod)abstractFactory.create ("DEBIT");
        assertEquals("pay to debit",paymentMethod.doPayment());
    }

}