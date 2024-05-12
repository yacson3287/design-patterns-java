package org.designpatterns.behavioral.chainofresponsability;

public class Black implements ApproveLoanChain {
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
        if (request.getTotalLoan() > 50000) {
            request.setType("Black");
        } else {
            next.creditCardRequest(request);
        }
    }



}
