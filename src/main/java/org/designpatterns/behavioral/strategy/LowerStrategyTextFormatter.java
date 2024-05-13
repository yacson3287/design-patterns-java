package org.designpatterns.behavioral.strategy;

public class LowerStrategyTextFormatter implements StrategyTextFormatter{
    @Override
    public String format(String text) {
        return text.toLowerCase();
    }
}
