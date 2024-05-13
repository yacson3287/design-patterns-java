package org.designpatterns.behavioral.strategy;

public class Context {

    private StrategyTextFormatter strategyTextFormatter;


    public Context(StrategyTextFormatter strategyTextFormatter) {
        this.strategyTextFormatter = strategyTextFormatter;
    }

    public String publishText(String text){
       return strategyTextFormatter.format(text);
    }


}
