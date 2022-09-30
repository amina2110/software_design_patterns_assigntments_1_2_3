package com.company;

public class SendByWhatsApp extends Decorator{
    protected Letter letter;

    public SendByWhatsApp(Letter letter){
        this.letter = letter;
    }

    @Override
    public String send() {
        return letter.send() +" The letter was send by WHATSAPP ";
    }
}
