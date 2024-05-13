package org.designpatterns.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void dettatch(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notityUpdate(TrafficLight trafficLight) {
        for (Observer o : observers) {
            o.Update(trafficLight);
        }
    }
}
