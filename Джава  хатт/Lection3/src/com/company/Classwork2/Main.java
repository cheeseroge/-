package com.company.Classwork2;

public class Main {

    public static void main(String[] args) {
        Params p = new Params(7.4,5.8,2.1);

        Figure figure = new Circle();
        figure.show(p);

        Figure square = new Square();
        square.show(p);

        Figure rectangle = new Rectangle();
        rectangle.show(p);
    }
}