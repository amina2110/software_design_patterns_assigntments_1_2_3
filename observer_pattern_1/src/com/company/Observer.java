package com.company;

import java.util.List;

public class Observer {
    private String name;
    public Observer(String name){
        this.name = name;
    }
    public void update(List<String> books){
        System.out.println("Hi "+name+"!The list of books was updated.");
        for(String b: books){
            System.out.print("["+b+"], ");
        }
    };
}
