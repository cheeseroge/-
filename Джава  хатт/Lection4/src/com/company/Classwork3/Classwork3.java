package com.company.Classwork3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Classwork3{
    public static void main(String[] args) {
        Queue<Character> qc = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Набери что-нибудь:");
        System.out.println("(если снова начнёшь считалочку Оксимирона, я работать не буду...)");
        String str = sc.nextLine();
        if (str.equals("говно")) {
            System.out.println("кринж...");
            System.exit(0);
        }
        for (char c : str.toCharArray())
            qc.offer(c);
        while (qc.peek() != null) {
            System.out.print(qc.poll() + " ");
        }

    }
}