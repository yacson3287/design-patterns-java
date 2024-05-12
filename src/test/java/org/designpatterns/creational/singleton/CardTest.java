package org.designpatterns.creational.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void createInstance(){
        Card.getINSTANCE().setNumber("123456789");
        var intance = Card.getINSTANCE();

        assertEquals("123456789",intance.getNumber());

    }
}