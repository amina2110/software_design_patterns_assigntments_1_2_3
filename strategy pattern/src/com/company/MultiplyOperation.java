package com.company;

public class MultiplyOperation implements Strategy{

    @Override
    public double operationResult(double a, double b) {
        return a*b;
    }
}
