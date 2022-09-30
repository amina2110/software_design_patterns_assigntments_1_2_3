package com.company;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements SocialNetworkAccount{
    private List<Observer> observers = new ArrayList<>();

    public void addPost(String name){
        notifyUpdate(name);
    }

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(String name) {
        for(Observer o: observers){
            o.update(name);
        }
    }
}
