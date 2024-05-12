package org.designpatterns.behavioral.iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CardListTest {

    Card[] cars;
    java.util.List<String> cardsType = Arrays.asList("VISA", "AMEX", "MASTER CARD", "GOOGLE CARD", "APPLE CARD");

    @BeforeEach
    void setUp() {
        cars = new Card[5];
        cars[0] = new Card("VISA");
        cars[1] = new Card("AMEX");
        cars[2] = new Card("MASTER CARD");
        cars[3] = new Card("GOOGLE CARD");
        cars[4] = new Card("APPLE CARD");
    }

    @Test
    public void iteratorCards() {
        List list = new CardList(cars);
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            var result = (Card) iterator.next();
            assertTrue(cardsType.contains(result.getType()));
        }
    }
}