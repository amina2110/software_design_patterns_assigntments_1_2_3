package com.company;

public class DivideOperation implements Strategy{
    @Override
    public double operationResult(double a, double b) {
        return a/b;
    }
}
