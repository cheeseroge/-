package com.company;

import java.util.Scanner;

public class Lect2Classwork1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите координаты центра круга:\nx1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("Введите радиус: ");
        double r1 = input.nextDouble();

        Circle circle1 = new Circle(x1, y1, r1);

        System.out.println("\nИмеем окружность:");
        circle1.print();

        System.out.print("\nКак вы хотите подвинуть круг:\nсдвиг по х: ");
        double xm = input.nextDouble();
        System.out.print("\nсдвиг по у: ");
        double ym = input.nextDouble();
        circle1.move(xm, ym);

        System.out.println("Теперь круг передвинут на:");
        circle1.print();

        System.out.print("Введите координаты другого круга:\nx2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        System.out.print("Введите радиус другого круга: ");
        double r2 = input.nextDouble();

        Circle circle2 = new Circle(x2, y2, r2);

        double dist = circle1.distToOtherCircle(circle2);

        System.out.println("\nРасстояние между двумя кругами: " + dist);
        System.out.print("Введите радиус для нового круга: ");
        double rn = input.nextDouble();
        circle1.changeRadius(rn);

        System.out.println("\nТеперь круг такой:");
        circle1.print();

        double p = circle1.getPerimeter();
        double s = circle1.getSquare();

        System.out.println("Периметр: " + p + "\nПлощадь: " + s);
    }
}

class Circle {
    private double x;
    private double y;
    private double r;

    public Circle (double xi, double yi, double ri){
        this.x = xi;
        this.y = yi;
        this.r = ri;
    }

    public void print() {
        System.out.println("Координаты центра: \nx: " + x + "\ny: " + y + "\nРадиус: " + r);
    }

    public void move(double xm, double ym) {
        x += xm;
        y += ym;
    }

    public double distToOtherCircle(Circle c) {
        return Math.sqrt(Math.pow(Math.abs(x - c.x), 2) + Math.pow(Math.abs(y - c.y), 2)) - r - c.r;
    }

    public void changeRadius(double rn) {
        r = rn;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getSquare() {
        return Math.PI * Math.pow(r, 2);
    }
}