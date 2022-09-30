package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private List<String> books = new ArrayList<>();

    public void addBook(String bookName){
        books.add(bookName);
        notifyUpdate();
    }

    public void removeBook(String bookName){
        books.remove(bookName);
        notifyUpdate();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate() {
        for(Observer o: observers){
            o.update(books);
        }
    }
}
