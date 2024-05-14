package org.designpatterns.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class AccountComposite implements AccountComponent {

    private List<AccountComponent> childAccounts;

    public AccountComposite() {
        this.childAccounts = new ArrayList<>();
    }

    @Override
    public void showAccountName() {
        for (var account : childAccounts) {
            account.showAccountName();
        }
    }

    @Override
    public Double getAmount() {
        Double totalAmount = 0.0;
        for (var account : childAccounts) {
            totalAmount += account.getAmount();
        }
        System.out.println("total: " + totalAmount);
        return totalAmount;
    }

    public void addAccount(AccountComponent accountComponent) {
        childAccounts.add(accountComponent);
    }

    public void removeAccount(AccountComponent accountComponent) {
        childAccounts.remove(accountComponent);
    }
}
