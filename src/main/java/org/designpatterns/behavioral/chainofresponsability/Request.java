package org.designpatterns.behavioral.chainofresponsability;

public class Request {

    private String type;
    private int totalLoan;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(int totalLoan) {
        this.totalLoan = totalLoan;
    }
}
