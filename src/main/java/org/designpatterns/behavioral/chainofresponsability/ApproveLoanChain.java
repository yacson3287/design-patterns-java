package org.designpatterns.behavioral.chainofresponsability;

public interface ApproveLoanChain {
    void setNext(ApproveLoanChain approveLoanChain);
    ApproveLoanChain getNext();
    void creditCardRequest(Request request);

}
