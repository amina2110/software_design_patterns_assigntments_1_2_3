package com.company;

public class Main {

    public static void main(String[] args) {

        Paying p1 = new Paying(new PayByCash());
        System.out.println(p1.toString(12000,"Bob"));

        Paying p2 = new Paying(new PayByPayPal());
        System.out.println(p2.toString(2343, "Alice"));

        Paying p3 = new Paying(new PayByCC());
        System.out.println(p3.toString(100000, "Ann"));
    }
}
