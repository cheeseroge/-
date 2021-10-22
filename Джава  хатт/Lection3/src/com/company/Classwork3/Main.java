package com.company.Classwork3;
import java.util.Scanner;

public class Main {

    public static void textLength(String s) {
        System.out.println("Количество букв в этой строчке: " + s.length());
    }
    public static void textHash(String s) {
        System.out.println("Хеш для этой строчки: " + s.hashCode() + " (осталось бы понять, чё это тебе дало, ну да ладно...)");
    }
    public static void textReverse(String s) {
        System.out.println("Если эту строчку ревёрснуть, то получится: " + new StringBuilder(s).reverse());
    }

    public static void textSBE(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи номер буквы, с которой нужно начать читать строчку, в диапазоне от 1 до " + s.length() + ":");
        int number1 = sc.nextInt();
        number1--;

        System.out.println("Введи номер буквы, на которой нужно закончить строчку, в диапазоне от 1 до " + s.length() + ":");
        int number2 = sc.nextInt();

        System.out.println("Получим вот такую строчку: " + s.substring(number1, number2));
    }
    public static void Error () {
        System.out.println("Ничё не понял");
    }

    public static void main(String[] args) {
        String exit;
        exit = "0";

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любой текст (для выхода введите exit) :");
        String text = sc.nextLine();



    }
}