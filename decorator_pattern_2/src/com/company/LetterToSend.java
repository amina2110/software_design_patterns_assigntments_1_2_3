package com.company;

public class LetterToSend implements Letter{
    @Override
    public String send() {
        return "Letter: ";
    }
}
