package com.company;

public class PayByCC implements PayStrategy{
    @Override
    public String howWasPaid(double amount, String customer_name) {
        return customer_name+": "+"$"+amount+" was paid by credit card";
    }
}
