package org.designpatterns.creational.abstractfactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {

    private static final String CREDIT = "CREDIT";
    private static final String DEBIT = "DEBIT";

    @Override
    public PaymentMethod create(String type) {
        return switch (type) {
            case CREDIT -> new Credit();
            case DEBIT -> new Debit();

            default -> throw new IllegalStateException("Unexpected value: " + type);
        };

    }
}
