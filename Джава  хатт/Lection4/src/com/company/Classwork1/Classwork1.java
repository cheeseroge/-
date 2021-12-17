package com.company.Classwork1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        String ans;
        ans = "y";
        int k = 0;
        double сheck = 0;

        while (!ans.equals("n")) {
            k++;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введи как зовут cтудента:");
            String names = sc.nextLine();
            System.out.println("Введи сколько лет студенту:");
            String age = sc.nextLine();
            int newAges = Integer.parseInt(age);
            System.out.println("Введи средний балл студента (только через точку от 1.0 до 5.0):");
            String score = sc.nextLine();
            double newScore = Double.parseDouble(score);

            students.add(new Student(names, newAges, newScore));
            System.out.println("Ещё нужно записать кого-нибудь? y/n?");
            do {
                ans = sc.nextLine();
                if (ans.equals("y") == false && ans.equals("n") == false) {
                    System.out.println("Сам то понял чё написал? я ж сказал - выберите y/n?");
                }
            } while (ans.equals("y") == false && ans.equals("n") == false);
        }

        for (Student i: students) {
            if (i.getAverageScore() > сheck) {
                сheck = i.getAverageScore();
            }
        }

        for (Student i: students) {
            if (i.getAverageScore() == сheck) {
                System.out.println("Студент-солнышко с лучшими баллами:");
                System.out.println("Имя: " + i.getName());
                System.out.println("Возраст: " + i.getAge());
                System.out.println("Средний балл: " + i.getAverageScore());
            }
        }

    }
}