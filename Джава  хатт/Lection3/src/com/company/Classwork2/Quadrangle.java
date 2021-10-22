package com.company.Classwork2;

public abstract class Quadrangle implements Figure {
    public String getFigureName(){ return "Четырёхугольник"; }

    public void show(Params p) {
        System.out.println("Имя фигуры: " + getFigureName() + "\nПлощадь: " + getSquare(p) + "\nПериметр: " + getPerimeter(p) + "\n");
    }
}