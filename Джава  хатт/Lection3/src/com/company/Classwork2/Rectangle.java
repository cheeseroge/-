package com.company.Classwork2;

public class Rectangle extends Quadrangle{

    @Override
    public String getFigureName(){ return "Прямоугольник"; }

    @Override
    public double getPerimeter(Params p) {
        return 2*(p.getA() + p.getB());
    }

    @Override
    public double getSquare(Params p) {
        return p.getA()*p.getB();
    }
}