package com.company.Classwork3;

import java.io.File;
import java.util.Arrays;

public class Classwork3 {

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Admin\\Desktop\\Оксимирон");

        String[] files = dir.list();
        if (files != null){
            Arrays.sort(files);
        }

        System.out.println(Arrays.toString(files));
        System.out.println();

        String path = "C:\\Users\\Admin\\Desktop\\Оксимирон\\тест.txt";
        File f = new File(path);

        try {
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        files = dir.list();
        if (files != null) {
            Arrays.sort(files);
        }

        System.out.println(Arrays.toString(files));

    }
}