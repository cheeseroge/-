package com.company.Homework1;

public class Numbers implements ArithmeticOperations{
    public NumberParams add(NumberParams a, NumberParams b) {
        return new NumberParams(a.getReal() + b.getReal(), 0);
    }

    public NumberParams subtract(NumberParams a, NumberParams b) {
        return new NumberParams(a.getReal() - b.getReal(), 0);
    }

    public NumberParams divide(NumberParams a, NumberParams b) {
        return new NumberParams(a.getReal() / b.getReal(), 0);
    }

    public NumberParams multiply(NumberParams a, NumberParams b) {
        return new NumberParams(a.getReal() * b.getReal(), 0);
    }
}