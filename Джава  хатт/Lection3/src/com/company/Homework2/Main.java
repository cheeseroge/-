package com.company.Homework2;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ну давай, набери чего-нибудь интересное:");

        String input = scanner.nextLine();
        StringTokenizer words = new StringTokenizer(input, " .,!?");

        String longword = "";
        int x = 0;
        int letters = 0;

        while (words.hasMoreTokens()) {
            String word = words.nextToken();
            x++;
            letters += word.length();

            if (word.length() > longword.length()) {
                longword = word;
            }
        }

        System.out.println("\nНабрано слов: " + x + "\nНабрано букв: " + letters + "\nСамое длинное слово: " + longword);
    }
}