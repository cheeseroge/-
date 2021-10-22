package com.company.Homework3;

public class Main {

    public static void main(String[] args) {
        String stroka = "лол";
        StringBuilder stroka_append = new StringBuilder("кек");
        String stringAdd = "чебурек";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stroka += stringAdd;
        }
        long end = System.currentTimeMillis();

        long time = end - start;

        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            stroka_append.append(stringAdd);
        }
        end = System.currentTimeMillis();

        long add_time = end - start;

        System.out.println("Время выполнения обычным методом : " + time + "ms" + "\nВремя выполнения методом с append'ом: " + add_time + "ms" + "\nМетод с append'ом быстрее обычного на " + (time-add_time) + "ms");
    }
}