package org.designpatterns.creational.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void create_object_card(){
        var car = new Card.CardBuilder("Visa", "0000")
                .name("Test")
                .expires(1)
                .credit(true)
                .build();

        assertEquals("Test",car.getName());
        assertEquals("Visa",car.getType());
        assertEquals(1,car.getExpires());
        assertTrue(car.isCredit());

    }
}