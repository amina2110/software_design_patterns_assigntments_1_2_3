package com.company;

public class SubstractOperation implements Strategy{

    @Override
    public double operationResult(double a, double b) {
        return a-b;
    }
}
