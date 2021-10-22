package com.company.Classwork4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ans = "y";
        StringBuilder text = new StringBuilder();
        int entercount = 0;
        Scanner sc = new Scanner(System.in);

        while (ans.equals("y")) {
            entercount++;
            System.out.println("Ну давай, напечатай что-нибудь:");
            text.append(sc.nextLine());
            System.out.println("Ого, круто, продолжаем?) (y/n)");
            ans = sc.nextLine();
        }
        System.out.println("\nСмотри чё получилось: " + text +
                "\nДлинна этой штуки: " + text.length() +
                "\nКоличество твоих вводов: " + entercount);
    }
}
