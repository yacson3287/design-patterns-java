package org.designpatterns.behavioral.state;

public class Vibration implements MobileAlertState {

    @Override
    public String alert(MobileAlertStateContext context) {
        return "VIBRATION";
    }
}
