package org.designpatterns.behavioral.observer;

public interface Subject {

    void attach(Observer o);

    void dettatch(Observer o);

    void notityUpdate(TrafficLight trafficLight);
}
