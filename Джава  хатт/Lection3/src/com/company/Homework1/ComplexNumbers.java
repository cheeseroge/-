package com.company.Homework1;

public class ComplexNumbers implements ArithmeticOperations {
    public NumberParams add(NumberParams a, NumberParams b) {
        double real1 = a.getReal();
        double real2 = b.getReal();
        double imagine1 = a.getImaginary();
        double imagine2 = b.getImaginary();
        return new NumberParams(real1 + real2, imagine1 + imagine2);
    }

    public NumberParams subtract(NumberParams a, NumberParams b) {
        double real1 = a.getReal();
        double real2 = b.getReal();
        double imagine1 = a.getImaginary();
        double imagine2 = b.getImaginary();
        return new NumberParams(real1 - real2, imagine1 - imagine2);
    }

    public NumberParams divide(NumberParams a, NumberParams b) {
        double real1 = a.getReal();
        double real2 = b.getReal();
        double imagine1 = a.getImaginary();
        double imagine2 = b.getImaginary();
        double divider = Math.pow(real2, 2) + Math.pow(imagine2, 2);
        return new NumberParams((real1*real2 + imagine1*imagine2)/ divider, (imagine1*real2-real1*imagine2)/ divider);
    }

    public NumberParams multiply(NumberParams a, NumberParams b) {
        double real1 = a.getReal();
        double real2 = b.getReal();
        double imagine1 = a.getImaginary();
        double imagine2 = b.getImaginary();
        return new NumberParams(real1*real2 - imagine1*imagine2, real1*imagine2 + imagine1*real2);
    }
}