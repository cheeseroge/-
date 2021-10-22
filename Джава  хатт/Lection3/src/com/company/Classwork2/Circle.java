package com.company.Classwork2;

public class Circle implements Figure {

    public String getFigureName() {
        return "Круг";
    }

    public double getPerimeter(Params p) {
        return 2*Math.PI*p.getR();
    }
    public double getSquare(Params p) {
        return Math.PI*Math.pow(p.getR(), 2);
    }

    public void show(Params p) {
        System.out.println("Имя фигуры: " + getFigureName() + "\nПлощадь: " + getSquare(p) + "\nПеример: " + getPerimeter(p) + "\n");
    }
}