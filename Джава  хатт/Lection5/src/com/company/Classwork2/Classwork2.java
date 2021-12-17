package com.company.Classwork2;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Classwork2 {

    public static void lineStr(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }

    static String checkStr(String s) throws NoSpaceException {
        if (!s.contains(" ")) {
            throw new NoSpaceException("В введённой строке не было обнаружено пробелов");
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();
        lineStr(s);
        try {
            checkStr(s);
        } catch (NoSpaceException e) {
            System.out.println(e.getMessage());
        }

    }
}