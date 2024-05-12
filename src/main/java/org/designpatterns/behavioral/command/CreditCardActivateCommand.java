package org.designpatterns.behavioral.command;

public class CreditCardActivateCommand implements Command{

    CreditCard creditCard;

    public CreditCardActivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.sendPingNumberToCustomer();
        creditCard.activate();
        creditCard.sendPingNumberToCustomer();
    }
}
