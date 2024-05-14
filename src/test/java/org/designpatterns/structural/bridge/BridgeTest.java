package org.designpatterns.structural.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void unsecurePayTest(){
        var card = new ClassicCreditCard(new UnsecureCreditCard());
        card.pay();
    }

    @Test
    public void usecurePayTest(){
        var card = new ClassicCreditCard(new SecrureCreditCard());
        card.pay();
    }


}