package org.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    public void capitalFormatterTest(){
        Context context = new Context(new CapitalStrategyTextFormatter());
        var result = context.publishText("this text is going to Capitalize");
        assertEquals("THIS TEXT IS GOING TO CAPITALIZE", result);
    }

    @Test
    public void lowerFormatterTest(){
        Context context = new Context(new LowerStrategyTextFormatter());
        var result = context.publishText("THIS TEXT IS GOING TO LOWERCASE");
        assertEquals("this text is going to lowercase", result);
    }

}