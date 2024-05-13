package org.designpatterns.behavioral.state;

public class Sound implements MobileAlertState{

    @Override
    public String alert(MobileAlertStateContext context) {
        return "SOUND";
    }
}
