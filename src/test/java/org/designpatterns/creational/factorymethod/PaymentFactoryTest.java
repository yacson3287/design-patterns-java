package org.designpatterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentFactoryTest {

    @Test
    public void should_return_payment_type_card() {
        var payment = PaymentFactory.buildPayment(TypePayment.CARD);
        var result = payment.doPayment();
        assertEquals("payment with credit card", result);
    }

    @Test
    public void should_return_payment_type_googlepay() {
        var payment = PaymentFactory.buildPayment(TypePayment.GOOGLE_PAY);
        var result = payment.doPayment();
        assertEquals("payment with google payment", result);
    }
}