package org.designpatterns.behavioral.mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void test(){
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteColleage1 concreteColleage1 = new ConcreteColleage1(concreteMediator);
        ConcreteColleage2 concreteColleage2 = new ConcreteColleage2(concreteMediator);

        concreteMediator.setUser1(concreteColleage1);
        concreteMediator.setUser2(concreteColleage2);

        concreteColleage1.send("Hello, I am User 1");
        concreteColleage2.send("Hello User 1, I am User 2");
    }
}