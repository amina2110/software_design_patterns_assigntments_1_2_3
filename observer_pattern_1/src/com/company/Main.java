package com.company;

public class Main {

    public static void main(String[] args) {
        Publisher library = new Publisher();

        Observer Bob = new Observer("Bob");
        Observer Alice = new Observer("Alice");
        library.attach(Bob);
        library.attach(Alice);

        library.addBook("In Search of Lost Time");
        library.addBook("Hamlet");
        library.addBook("Alice's Adventures in Wonderland ");

        library.detach(Alice);

        library.removeBook("In Search of Lost Time");
    }
}
