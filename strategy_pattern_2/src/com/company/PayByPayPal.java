package com.company;

public class PayByPayPal implements PayStrategy{
    @Override
    public String howWasPaid(double amount, String customer_name) {
        return customer_name+": "+"$"+amount+" was paid via PayPal";
    }
}
