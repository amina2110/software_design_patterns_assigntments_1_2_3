package com.company;

public interface SocialNetworkAccount {
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifyUpdate(String name);
}
