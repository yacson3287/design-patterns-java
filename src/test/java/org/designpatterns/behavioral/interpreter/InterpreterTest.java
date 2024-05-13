package org.designpatterns.behavioral.interpreter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpreterTest {

    Expression expressionOR;
    Expression expressionAND;
    @BeforeEach
    void setUp() {
        var zero = new TerminalExpression("0");
        var one = new TerminalExpression("1");

        expressionOR = new OrExpression(zero, one);
        expressionAND = new AndExpression(zero,one);

    }

    @Test
    public void expressionAndTest(){
        var result = expressionAND.interpret("0,1");
        assertTrue(result);

        var result2 = expressionAND.interpret("0");
        assertFalse(result2);

    }

    @Test
    public void expressionORTest(){
        var result = expressionOR.interpret("0");
        assertTrue(result);

        var result2 = expressionOR.interpret("zero");
        assertFalse(result2);
    }
}