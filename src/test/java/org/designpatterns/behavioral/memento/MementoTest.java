package org.designpatterns.behavioral.memento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MementoTest {

    Carataker carataker = new Carataker();
    Article article;

    @BeforeEach
    void setUp() {
        article = new Article("Author 1", "Memento is a movie");
        article.setText("Nolan movie");
        carataker.addMemento(article.createMemento());

        article.setText("starring Guy Pearce");
        carataker.addMemento(article.createMemento());

        article.setText("and Leonardo Di Caprio");

    }

    @Test
    public void getMementoTest() {
        ArticeMemento memento1 = carataker.getMemento(0);
        ArticeMemento memento2 = carataker.getMemento(1);

        assertEquals("Nolan movie", memento1.getText());

        assertEquals("starring Guy Pearce", memento2.getText());

    }

    @Test
    public void restoreTest() {
        ArticeMemento memento1 = carataker.getMemento(0);
        article.restoreMemento(memento1);
        assertEquals("Nolan movie", article.getText());
    }

}