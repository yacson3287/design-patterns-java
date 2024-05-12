package org.designpatterns.behavioral.chainofresponsability;

public class Card implements ApproveLoanChain {
    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain approveLoanChain) {
        next = approveLoanChain;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(Request request) {
        var gold = new Gold();
        this.setNext(gold);

        var platinium = new Platinium();
        gold.setNext(platinium);

        var black = new Black();
        platinium.setNext(black);

        next.creditCardRequest(request);

    }



}
