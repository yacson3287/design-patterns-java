package org.designpatterns.structural.proxy;

public class AccessToInternet implements Internet {

    @Override
    public void connectTO(String url) throws Exception {
        System.out.println("Connecting to:" + url);
    }
}
