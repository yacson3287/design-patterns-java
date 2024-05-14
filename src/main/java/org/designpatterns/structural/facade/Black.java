package org.designpatterns.structural.facade;

public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("the Black Card has credit of 1.000.000");
    }
}
