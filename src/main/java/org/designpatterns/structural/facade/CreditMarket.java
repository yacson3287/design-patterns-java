package org.designpatterns.structural.facade;

public class CreditMarket {

    private Credit gold;
    private Credit silver;
    private Credit black;


    public CreditMarket() {
        this.black =new Black();
        this.silver = new Silver();
        this.gold = new Gold();
    }

    public void showCreditGold(){
        this.gold.showCredit();
    }
    public void showCreditSilver(){
        this.silver.showCredit();
    }
    public void showCreditBlack(){
        this.black.showCredit();
    }

}
