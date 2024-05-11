package org.designpatterns.creational.prototype;


public class Visa implements PrototypeCard{

    private String name;

    @Override
    public void getCard() {
        System.out.println("This is a Visa Card");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        return (Visa) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
