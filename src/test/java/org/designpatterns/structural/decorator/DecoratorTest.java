package org.designpatterns.structural.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void GoldTest(){
        Credit gold = new Gold();
        gold.showCredit();

    }

    @Test
    public void BlackInternationalPaymentTest(){
        Credit black = new Black();
        black = new InternationalPaymentDecorator(black);
        black.showCredit();
    }

    @Test
    public void GoldSecureTest(){
        Credit gold = new Gold();
        gold = new SecureDecorator(gold);
        gold.showCredit();

    }
}