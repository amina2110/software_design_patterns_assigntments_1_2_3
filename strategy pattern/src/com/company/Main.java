package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Context operation_1 = new Context(new AddOperation());
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(a+"+"+b+"="+operation_1.executeOperation(a,b));

        Context operation_2 = new Context(new SubstractOperation());
        a = sc.nextDouble();
        b= sc.nextDouble();
        System.out.println(a+"-"+b+"="+ operation_2.executeOperation(a,b));

        Context operation_3 = new Context(new MultiplyOperation());
        a = sc.nextDouble();
        b= sc.nextDouble();
        System.out.println(a+"*"+b+"="+ operation_3.executeOperation(a,b));

        Context operation_4 = new Context(new DivideOperation());
        a = sc.nextDouble();
        b= sc.nextDouble();
        System.out.println(a+"/"+b+"="+ operation_4.executeOperation(a,b));
    }
}
