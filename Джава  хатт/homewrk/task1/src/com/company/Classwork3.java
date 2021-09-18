package com.company;

import java.util.Scanner;
public class Classwork3
    {
        public static void main(String[] args) {
        double y = 10.0;
        double x = 20.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число и я проверю попадает ли оно в интервал от 10 до 20");
        double t = sc.nextDouble();
        if (y <= t && t <= x) {
            System.out.println("Попадает");
        } else {
            System.out.println("Не попадает");
        }
    }
    }