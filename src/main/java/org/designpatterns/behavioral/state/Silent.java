package org.designpatterns.behavioral.state;

public class Silent implements MobileAlertState {

    @Override
    public String alert(MobileAlertStateContext context) {
        return "SILENT";
    }
}
