package org.designpatterns.structural.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void accountsTest(){
        AccountComponent checkingAccount = new CheckingAccount(1000.0, "user 1");
        AccountComponent savingAccount = new SavingsAccount(1200.0, "user 1");

        AccountComposite composite = new AccountComposite();
        composite.addAccount(checkingAccount);
        composite.addAccount(savingAccount);

        composite.showAccountName();
        composite.getAmount();

    }
}