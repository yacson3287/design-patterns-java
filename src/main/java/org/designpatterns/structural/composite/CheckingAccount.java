package org.designpatterns.structural.composite;

public class CheckingAccount implements AccountComponent{

    private Double amount;
    private String name;

    public CheckingAccount(Double amount, String name) {
        this.amount = amount;
        this.name = name;
    }


    @Override
    public void showAccountName() {
        System.out.println("Checking account: " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
