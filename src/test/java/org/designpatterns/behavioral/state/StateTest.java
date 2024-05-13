package org.designpatterns.behavioral.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    MobileAlertStateContext context;

    @BeforeEach
    void setUp() {
        context = new MobileAlertStateContext();
    }

    @Test
    public void should_return_state_sound(){
     var result = context.alert();
     assertEquals("SOUND", result);
    }

    @Test
    public void should_return_state_silent(){
        context.setState(new Silent());
        var result = context.alert();
        assertEquals("SILENT", result);
    }

    @Test
    public void should_return_state_vibration(){
        context.setState(new Vibration());
        var result = context.alert();
        assertEquals("VIBRATION", result);
    }




}