package org.designpatterns.behavioral.command;

public class CreditCard {

    public void sendPingNumberToCustomer(){
        System.out.println("pin number sent to client");
    }

    public void sendSmsToCustomerActivate(){
        System.out.println("sms sent to client");
    }

    public void activate(){
        System.out.println("card activate");
    }

    public void desactivate(){
        System.out.println("card desactivate");
    }

    public void sendSmsToCustomoerDesactivate(){
        System.out.println("sms sent to client for inform that their card has been deactivated ");
    }


}
