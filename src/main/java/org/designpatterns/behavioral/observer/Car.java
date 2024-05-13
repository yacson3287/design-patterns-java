package org.designpatterns.behavioral.observer;

public class Car implements Observer {

    private String message;

    @Override
    public void Update(TrafficLight trafficLight) {
        switch (trafficLight.getStatus()) {
            case RED_FOR_CAR -> message = "Traffic light red for car";
            case GREEN_FOR_CAR -> message = "Traffic light green for car";
        }
    }

    public String getMessage() {
        return message;
    }
}
