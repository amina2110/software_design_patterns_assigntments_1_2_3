package com.company;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public double executeOperation(double a, double b){
        return strategy.operationResult(a,b);
    }
}
