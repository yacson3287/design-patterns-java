package org.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import static org.designpatterns.creational.prototype.PrototypeFactory.CartType.AMEX;
import static org.designpatterns.creational.prototype.PrototypeFactory.CartType.VISA;

public class PrototypeFactory {

    public static class CartType{
        public static final String VISA = "VISA";
        public static final String AMEX = "AMEX";
    }

    private static Map<String,PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException{
        return prototypes.get(type).clone();
    }

    public static void loadCard(){
        var visa = new Visa();
        visa.setName("Card visa with number 000000");
        prototypes.put(VISA,visa);

        var amex = new Amex();
        amex.setName("Card Amex with number 111111");
        prototypes.put(AMEX,amex);
    }
}
