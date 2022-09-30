package com.company;

import java.util.List;

public class Observer {
    private String name;

    public Observer(String name){
        this.name = name;
    }

    public void update(String name){
        System.out.println("Hi "+this.name+"!There's a new post in the group from "+name+".");
    };
}
