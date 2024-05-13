package org.designpatterns.behavioral.strategy;

public class CapitalStrategyTextFormatter implements StrategyTextFormatter{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
