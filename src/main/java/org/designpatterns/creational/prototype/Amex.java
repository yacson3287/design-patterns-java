package org.designpatterns.creational.prototype;

public class Amex implements PrototypeCard{

    String name;

    @Override
    public void getCard() {
        System.out.println("This is a Amex Card");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        return (Amex) super.clone();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
