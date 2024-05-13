package org.designpatterns.behavioral.observer;

public class Pedestrian implements Observer {

    private String message;

    @Override
    public void Update(TrafficLight trafficLight) {
        switch (trafficLight.getStatus()) {
            case RED_FOR_CAR -> this.message = "Traffic light green for pedestrian";
            case GREEN_FOR_CAR -> this.message = "Traffic light red for pedestrian";
        }

    }

    public String getMessage() {
        return message;
    }
}
