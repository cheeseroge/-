package com.company.Classwork2;
import java.util.*;

public class Classwork2 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        String text = "Java is a programming language that is concurrent , classbased and object-oriented .";
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.equals(",") || word.equals(".") || word.length()<=3) {
                word = null;
            } else {
                str.add(word);
            }
        }

        System.out.println();

    }
}