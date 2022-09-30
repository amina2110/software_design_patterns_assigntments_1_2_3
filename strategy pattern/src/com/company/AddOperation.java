package com.company;

public class AddOperation implements Strategy {

    @Override
    public double operationResult(double a, double b) {
        return a+b;
    }
}
