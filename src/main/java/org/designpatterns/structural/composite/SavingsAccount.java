package org.designpatterns.structural.composite;

public class SavingsAccount implements AccountComponent {

    private Double amount;
    private String name;

    public SavingsAccount(Double amount, String name) {
        this.amount = amount;
        this.name = name;
    }


    @Override
    public void showAccountName() {
        System.out.println("Savings account : " + name);
    }

    @Override
    public Double getAmount() {
        return amount;
    }
}
