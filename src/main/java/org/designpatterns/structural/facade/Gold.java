package org.designpatterns.structural.facade;

public class Gold implements Credit{
    @Override
    public void showCredit() {
        System.out.println("the Gold Card has credit of 5.000");
    }
}
