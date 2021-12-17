package com.company.Classwork4;
import java.io.*;
public class Classwork4 {

    public static void main(String[] args) {
        File in = new File("C:\\Users\\Admin\\Desktop\\Оксимирон\test1.txt");
        File out = new File("C:\\Users\\Admin\\Desktop\\Оксимирон\test2.txt");

        try {
            in.createNewFile();
            out.createNewFile();
            Writer writer = new FileWriter(in);
            writer.write("записываю вот что-нибудь");
            writer.close();

            FileInputStream inputStream = new FileInputStream(in);
            FileOutputStream outputStream = new FileOutputStream(out);

            byte[] buffer = {};
            inputStream.read(buffer);
            System.out.println(buffer);
            outputStream.write(buffer);

            Reader reader = new FileReader(out);
            char[] str = {};
            reader.read(str);
            System.out.println(str);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}