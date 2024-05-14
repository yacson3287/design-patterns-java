package org.designpatterns.structural.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProxyTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void internetTest() {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTO("Udemy.com");
            internet.connectTO("facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}