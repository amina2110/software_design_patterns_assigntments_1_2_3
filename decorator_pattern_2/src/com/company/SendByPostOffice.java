package com.company;

public class SendByPostOffice extends Decorator{

    protected Letter letter;

    public SendByPostOffice(Letter letter){
        this.letter = letter;
    }

    public String send() {
        return letter.send() +" The letter was send via POST OFFICE ";
    }
}
