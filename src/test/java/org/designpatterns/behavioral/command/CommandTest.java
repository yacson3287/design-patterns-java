package org.designpatterns.behavioral.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommandTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void commandActivateTest() {
        var creditCard = new CreditCard();
        var invoker = new CreditCardInvoker();

        invoker.setCommand(new CreditCardActivateCommand(creditCard));
        invoker.run();
    }

    @Test
    public void commandDesactivateTest() {
        var creditCard = new CreditCard();
        var invoker = new CreditCardInvoker();

        invoker.setCommand(new CreditCardDesactivateCommand(creditCard));
        invoker.run();
    }
}