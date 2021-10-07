package com.company;

import java.util.Random;
public class Lect1Classwork5 {
        public static void main(String[] args) {
            int[] one = new int[10];
            int[] two = new int[10];
            String notsame = " ";

            for (int i = 0; i < 10; i = i+1){
                one[i] = new Random().nextInt(10);
                two[i] = new Random().nextInt(10);
            }

            for (Integer i = 0; i < 10; i = i+1){
                if (one[i] != two[i]){
                    Integer num = i + 1;
                    notsame += num + " ";
                }
            }

            System.out.println("Первый массив:");
            for (int d: one){
                System.out.print(d);
            }
            System.out.println(" ");
            System.out.println("Второй массив:");
            for (int d: two){
                System.out.print(d);
            }
            System.out.println(" ");
            System.out.println("Номера отличающихся элементов: "+ notsame);
        }
}
