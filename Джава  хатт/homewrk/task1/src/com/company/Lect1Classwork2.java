package com.company;

import java.util.Scanner;
import java.lang.Math;
public class Lect1Classwork2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Итак, объём чего попробуем посчитать?)");
        System.out.println("Варианты ответов: 1) Параллелипипеда 2) Шара 3) Цилиндра");
        int t = sc.nextInt();
        if (t == 1) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введите длину:");
            int a = sc.nextInt();
            System.out.println("Введите ширину:");
            int b = sc.nextInt();
            System.out.println("Введите высоту:");
            int c = sc.nextInt();
            sc.close();
            System.out.println("Объём параллелипипеда: " + a * b * c);
        } else if (t == 2) {
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Введите радиус шара:");
            int r = sc.nextInt();
            sc.close();
            System.out.println("Объём шара: " +4*Math.PI*Math.pow(r,3)/3);
        } else if (t == 3) {
            Scanner sc3 = new Scanner(System.in);
            System.out.println("Введите радиус основания цилиндра:");
            int r = sc.nextInt();
            System.out.println("Введите высоту цилиндра:");
            int h = sc.nextInt();
            sc.close();
            System.out.println("Объём циллиндра: " +h*Math.PI*r*r);
        }
        else System.out.println("Это точно не похоже ни на одну из трёх предложенных цифр");
    }
}