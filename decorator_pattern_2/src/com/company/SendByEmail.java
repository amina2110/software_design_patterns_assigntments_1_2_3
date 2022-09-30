package com.company;

public class SendByEmail extends Decorator{

    protected Letter letter;

    public SendByEmail(Letter letter){
        this.letter = letter;
    }

    @Override
    public String send() {
        return letter.send() + " The letter was send by EMAIL ";
    }
}
