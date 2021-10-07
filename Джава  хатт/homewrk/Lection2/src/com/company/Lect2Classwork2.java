package com.company;

import java.util.Scanner;

public class Lect2Classwork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите коэффицент a: ");
        double a = sc.nextDouble();
        System.out.print("Введите коэффицент b: ");
        double b = sc.nextDouble();
        System.out.print("Введите коэффицент c: ");
        double c = sc.nextDouble();

        Roots root = Roots.getRoots(a, b, c);

        if (root.count == 0) {
            System.out.println("Уравнение не имеет корней");
        } else if (root.count == 1) {
            System.out.println("Уравнение имеет одно решение: " + root.x1);
        } else if (root.count == 2) {
            System.out.println("Уравнение имеет два корня: x1=" + root.x1 + "x2=" + root.x2);
        }
    }
}


class Roots {
    double x1;
    double x2;
    int count;

    static Roots getRoots(double a, double b, double c) {
        Roots root = new Roots();
        double D = Math.pow(b, 2) - 4*a*c;

        if (D > 0) {
            root.x1 = (-b + Math.sqrt(D))/2*a;
            root.x2 = (-b - Math.sqrt(D))/2*a;
            root.count = 2;
        } else if (D == 0) {
            root.x1 = -b/2*a;
            root.x2 = root.x1;
            root.count = 1;
        } else {
            root.count = 0;
        }

        return root;
    }
}