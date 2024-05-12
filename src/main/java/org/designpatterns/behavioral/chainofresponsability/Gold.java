package org.designpatterns.behavioral.chainofresponsability;

public class Gold implements ApproveLoanChain {

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
        if (request.getTotalLoan() <= 10000) {
            request.setType("Gold");
        } else {
            next.creditCardRequest(request);
        }
    }




}
