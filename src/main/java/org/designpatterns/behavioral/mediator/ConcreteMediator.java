package org.designpatterns.behavioral.mediator;

public class ConcreteMediator implements Mediator {

    ConcreteColleage1 user1;
    ConcreteColleage2 user2;

    public void setUser1(ConcreteColleage1 user1) {
        this.user1 = user1;
    }

    public void setUser2(ConcreteColleage2 user2) {
        this.user2 = user2;
    }

    @Override
    public void send(String message, Colleage college) {
        if (college == user1) {
            user2.messageReceived(message);
        } else if (college == user2) {
            user1.messageReceived(message);
        }
    }
}
