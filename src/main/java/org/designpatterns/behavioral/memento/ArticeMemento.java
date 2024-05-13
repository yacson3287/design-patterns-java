package org.designpatterns.behavioral.memento;

public class ArticeMemento {
    public ArticeMemento(String author, String text) {
        this.author = author;
        this.text = text;
    }

    private String author;
    private String text;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
