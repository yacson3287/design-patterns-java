package org.designpatterns.structural.facade;

public class Silver implements Credit{
    @Override
    public void showCredit() {
        System.out.println("the Silver Card has credit of 200.000");
    }
}
