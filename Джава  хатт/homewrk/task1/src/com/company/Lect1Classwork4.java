package com.company;

import java.util.Scanner;
public class Lect1Classwork4 {
    public static void main(String[] args) {
        double y = 10.0;
        double x = 50.0;
        for (int work = 1; work <= 100; ) {
            System.out.println("Введи число и я проверю попадает ли оно в интервал от 10 до 20");
            Scanner sc = new Scanner(System.in);
            double t = sc.nextDouble();
            if (y <= t && t <= x) {
                System.out.println("Попадает");
            } else {
                System.out.println("Не попадает");
            }

            System.out.println("Проверим ещё чего-нибудь Да/Нет?)");
            Scanner answer = new Scanner(System.in);
            String ans = answer.next();
            if (ans.equals("Да") || ans.equals("да")) {
                continue;
            } else if (ans.equals("Нет") || ans.equals("нет")) {
                break;
            } else {
                System.out.println("Ничего не понял, ну и ладно");
                break;
            }
        }
        System.out.println("Ну и пожалуйста, ну и не нужно...");
    }
}