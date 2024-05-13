package org.designpatterns.behavioral.observer;

public class TrafficLight {

    private StatusTrafficLight status;

    public TrafficLight(StatusTrafficLight status) {
        this.status = status;
    }

    public StatusTrafficLight getStatus() {
        return status;
    }
}
