package org.designpatterns.structural.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void facadeTest(){
        CreditMarket creditMarket = new CreditMarket();
        creditMarket.showCreditGold();
        creditMarket.showCreditSilver();
        creditMarket.showCreditBlack();
    }
}