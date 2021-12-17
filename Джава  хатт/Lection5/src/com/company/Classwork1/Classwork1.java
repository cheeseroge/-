package com.company.Classwork1;
import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            while (true) {
                System.out.print("Введи какое-нибудь число: ");
                String s = sc.nextLine();
                try {
                    int number = Integer.parseInt(s);
                    a[index] = number;
                    index++;
                    break; }
                catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Ой, что-то пошло не так: " + e.getMessage());
                }
            }
        }
    }
}