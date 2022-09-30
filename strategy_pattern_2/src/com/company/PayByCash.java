package com.company;

public class PayByCash implements PayStrategy{
    @Override
    public String howWasPaid(double amount,String customer_name) {
        return customer_name+": "+"$"+amount+" was paid by cash";
    }
}
