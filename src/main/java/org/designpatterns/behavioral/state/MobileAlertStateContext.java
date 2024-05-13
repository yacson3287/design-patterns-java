package org.designpatterns.behavioral.state;

public class MobileAlertStateContext {

    private MobileAlertState currentState;

    public MobileAlertStateContext() {
        this.currentState = new Sound();
    }

    public void setState(MobileAlertState currentState) {
        this.currentState = currentState;
    }

    public String alert(){
        return currentState.alert(this);
    }
}
