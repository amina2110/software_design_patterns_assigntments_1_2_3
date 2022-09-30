package com.company;

public class Main {

    public static void main(String[] args) {
	Observer user1 = new Observer("Kate");
    Observer user2 = new Observer("Mark");

    Publisher socialNetwork = new Publisher();
    socialNetwork.subscribe(user1);
    socialNetwork.subscribe(user2);
    socialNetwork.addPost("Maria");
    socialNetwork.addPost("Arina");
    socialNetwork.unsubscribe(user1);
    socialNetwork.addPost("Bob");
    }
}
