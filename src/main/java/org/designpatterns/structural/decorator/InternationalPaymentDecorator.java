package org.designpatterns.structural.decorator;

public class InternationalPaymentDecorator extends CreditDecorator{

    public InternationalPaymentDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configInternationalPayment();
    }

    private void configInternationalPayment(){
        System.out.println("The Card did configure for do international payment");
    }
}
