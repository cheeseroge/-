package com.company;

import java.util.Scanner;
public class Lect1Homework2 {
    public static void main(String[] args) {
        String status = "Нет такого";
        String[] SixThreeSix = new String[]{"Егор", "Дима", "Андрей"};
        System.out.println("Введи имя для проверки в списке");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        for (int i = 0; i < 3; i++) {
            if (name.equals(SixThreeSix[i])) {
                status = "Есть такое";
                break;
            }
            else {
                continue;
            }
        }
        System.out.println(status);
    }
}