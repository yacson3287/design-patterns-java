package org.designpatterns.behavioral.templatemethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemplateMethodTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void PaymentPaypalTest(){
        var payment = new PaymentPaypal();
        payment.makePayment();
    }

    @Test
    public void PaymentPaypalVisa(){
        var payment = new PaymentVisa();
        payment.makePayment();
    }

}