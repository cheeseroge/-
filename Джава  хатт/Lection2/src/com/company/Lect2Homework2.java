package com.company;

import java.util.Scanner;

public class Lect2Homework2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длинну:");
        double a = sc.nextDouble();
        System.out.print("Введите ширину:");
        double b = sc.nextDouble();
        System.out.print("Введите высоту:");
        double c = sc.nextDouble();

        Parallelepiped p = new Parallelepiped(a, b, c);

        System.out.println("Объём: " + Parallelepiped.getObyom(p));
        System.out.println("Площадь: " + Parallelepiped.getPloshad(p));
    }
}

class Parallelepiped {
    private double a;
    private double b;
    private double c;

    public Parallelepiped(double a, double b, double c){
        setA(a);
        setB(b);
        setC(c);
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public static double getObyom(Parallelepiped p) {
        return p.getA() * p.getB() * p.getC();
    }
    public static double getPloshad(Parallelepiped p) {
        return 2 * (p.getA() * p.getB() + p.getB() * p.getC() + p.getC() * p.getA());
    }
}