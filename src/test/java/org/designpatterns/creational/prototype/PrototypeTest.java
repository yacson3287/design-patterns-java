package org.designpatterns.creational.prototype;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {


    @BeforeAll
    public static void setUp(){
        PrototypeFactory.loadCard();
    }

    @Test
    public void clone_card_visa() throws CloneNotSupportedException {
        var visa =(Visa) PrototypeFactory.getInstance("VISA");
        assertEquals("Card visa with number 000000",visa.getName());
    }

    @Test
    public void clone_card_amex() throws CloneNotSupportedException {
        var amex =(Amex) PrototypeFactory.getInstance("AMEX");
        assertEquals("Card Amex with number 111111",amex.getName());
    }

}