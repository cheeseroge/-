package com.company.Homework1;

class Planet {
    private double Sputnik;
    private double Radius;
    private double Square;

    Planet(double a, double b, double c) {
        this.Sputnik = a;
        this.Radius = b;
        this.Square = c;
    }

    double getSputnik() {
        return Sputnik;
    }
    double getRadius() {
        return Radius;
    }
    double getSquare() {
        return Square;
    }
    void setSputnik(double a) {
        this.Sputnik = a;
    }
    void setRadius(double b) {
        this.Radius = b;
    }
    void setSquare(double c) {
        this.Square = c;
    }
}