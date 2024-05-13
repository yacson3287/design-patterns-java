package org.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Carataker {

    private List<ArticeMemento> status = new ArrayList<>();

    public void addMemento(ArticeMemento memento) {
        status.add(memento);
    }

    public ArticeMemento getMemento(int index) {
        return status.get(index);
    }
}
