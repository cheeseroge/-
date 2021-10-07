package com.company;
import java.util.Scanner;
import java.math.BigInteger;
public class Lect2Classwork5 {

    public static void main(String[] args) {
        System.out.println("Чего надо сделать? 1 - сложить, 2 - вычесть, 3 - умножить, 4 - поделить, 5 - возвести в степень, 6 - найти факториал числа");
        Scanner scan = new Scanner(System.in);
        String operation = scan.next();

        Scanner in = new Scanner(System.in);
        System.out.print("Введи первое число: ");
        double a = in.nextDouble();
        System.out.print("Введи второе число: ");
        double b = in.nextDouble();

        switch (operation){
            case "1":
                System.out.println(a + " + " + b + " = " + MathUtils.sum(a, b));
                break;
            case "2":
                System.out.println(a + " - " + b + " = " + MathUtils.diff(a, b));
                break;
            case "3":
                System.out.println(a + " * " + b + " = " + MathUtils.mul(a, b));
                break;
            case "4":
                System.out.println(a + " / " + b + " = " + MathUtils.div(a, b));
                break;
            case "5":
                System.out.println(a + "^" + b + " = " + MathUtils.pow(a, b));
                break;
            case "6":
                System.out.print("Введи число от которого нужно факториал: ");
                int d = in.nextInt();
                System.out.println(d + "!" + " = " + MathUtils.fact(d));
                break;
            default:
                System.out.println("Я не понимаю - чего ты от меня хочешь?");
        }

    }
}

class MathUtils {
    //сложить
    public static double sum(double a, double b) {
        return a + b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum(double a, int b) {
        return a + b;
    }
    public static double sum(int a, double b) {
        return a + b;
    }


    //вычесть
    public static double diff(double a, double b) {
        return a - b;
    }
    public static int diff(int a, int b) {
        return a - b;
    }
    public static double diff(double a, int b) {
        return a - b;
    }
    public static double diff(int a, double b) {
        return a - b;
    }


    //умножить
    public static double mul(double a, double b) {
        return a * b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static double mul(double a, int b) {
        return a * b;
    }
    public static double mul(int a, double b) {
        return a * b;
    }


    //поделить
    public static double div(double a, double b) {
        return a / b;
    }
    public static double div(int a, int b) {
        return a / b;
    }
    public static double div(double a, int b) {
        return a / b;
    }
    public static double div(int a, double b) {
        return a / b;
    }


    // возвести в степень
    public static double pow(double a, double c) {
        return Math.pow(a, c);
    }
    public static double pow(int a, int c) {
        return Math.pow(a, c);
    }
    public static double pow(double a, int c) {
        return Math.pow(a, c);
    }
    public static double pow(int a, double c) {
        return Math.pow(a, c);
    }


    //зафакториалить
    public static BigInteger fact(int f) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}
