package org.designpatterns.behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObserverTest {

    Car car;
    Pedestrian pedestrian;
    MessagePublisher messagePublisher;

    @BeforeEach
    void setUp() {
        car = new Car();
        pedestrian = new Pedestrian();
        messagePublisher = new MessagePublisher();
        messagePublisher.attach(car);
        messagePublisher.attach(pedestrian);

    }

    @Test
    public void trafficLigthTest() {
        messagePublisher.notityUpdate(new TrafficLight(StatusTrafficLight.RED_FOR_CAR));

        assertEquals("Traffic light red for car", car.getMessage());
        assertEquals("Traffic light green for pedestrian", pedestrian.getMessage());

        messagePublisher.notityUpdate(new TrafficLight(StatusTrafficLight.GREEN_FOR_CAR));

        assertEquals("Traffic light green for car", car.getMessage());
        assertEquals("Traffic light red for pedestrian", pedestrian.getMessage());

    }


}