package org.designpatterns.behavioral.visitor;

public interface ElementOffer {

    void accept(CreditCardVisitor creditCardVisitor);
}
