package com.company;

public class Paying {
    private PayStrategy paying;

    public Paying(PayStrategy paystrategy){
        this.paying = paystrategy;
    }

    public String toString(double amount, String customer_name) {
        return paying.howWasPaid(amount, customer_name);
    }
}
