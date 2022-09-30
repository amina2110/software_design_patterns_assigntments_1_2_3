package com.company;

public class Main {

    public static void main(String[] args) {
        Letter l1 = new SendByEmail(new LetterToSend());
        System.out.println(l1.send());

        Letter l2 = new SendByEmail(new SendByWhatsApp(new LetterToSend()));
        System.out.println(l2.send());

        Letter l3 = new SendByWhatsApp(new SendByEmail(new SendByPostOffice(new LetterToSend())));
        System.out.println(l3.send());
    }
}
