package org.designpatterns.behavioral.mediator;

public class ConcreteColleage1 extends Colleage {


    public ConcreteColleage1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("The colleage one received the message: " + message);
    }
}
