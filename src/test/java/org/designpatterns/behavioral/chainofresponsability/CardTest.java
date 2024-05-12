package org.designpatterns.behavioral.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void chainOfResposabilityTest(){
        var request = new Request();
        request.setTotalLoan(1000);

        Card card = new Card();
        card.creditCardRequest(request);
        assertEquals("Gold", request.getType());

        request.setTotalLoan(40000);
        card.creditCardRequest(request);
        assertEquals("Platinium", request.getType());

        request.setTotalLoan(60000);
        card.creditCardRequest(request);
        assertEquals("Black", request.getType());


    }
}