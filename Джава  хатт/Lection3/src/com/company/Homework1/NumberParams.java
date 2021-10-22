package com.company.Homework1;

public class NumberParams {
    private final double real;
    private final double imaginary;

    public NumberParams(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }
}