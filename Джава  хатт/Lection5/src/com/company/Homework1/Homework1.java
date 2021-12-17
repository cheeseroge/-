package com.company.Homework1;

import java.io.*;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) throws IOException {

        String file = "C:\\Users\\Admin\\Desktop\\Оксимирон\\Партизанское радио.txt";
        File f = new File(file);

        if ((f.exists())) {
            System.out.println("О, такой файл есть, вот его текст:");
        }
        else {
            System.out.println("Создаю файл с таким эминем...");
        }

        try {
            if (!f.createNewFile()) ;
        }
        catch (IOException a) {
        }

        try {
            BufferedReader read = new BufferedReader(new FileReader(f));
            try {
                String s = null;
                while ((s = read.readLine()) != null)
                    System.out.println(s);
            }
            finally {
                read.close();
            }
        } catch (IOException oy) {
            System.out.println(oy.getMessage());
        }

        System.out.println("Введи что-нибудь, что хочешь в него добавить: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        builder.append(text);

        FileWriter fileWriter = new FileWriter(f, true);
        fileWriter.write(String.valueOf(builder));
        fileWriter.close();
        System.out.println("Всё готово, теперь этот текст выглядит вот так:");

        try {
            BufferedReader in = new BufferedReader(new FileReader(f));
            try {
                String s = null;
                while ((s = in.readLine()) != null)
                    System.out.println(s);
            }
            finally {
                in.close();
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
