package com.company;

import java.util.Arrays;
import java.util.Random;
public class Lect1Classwork6 {
        public static void main(String[] args) {
            int[] mASSiv = new int[15];
            for (int i = 0; i < 15; i = i+1){
                mASSiv[i] = new Random().nextInt(10);}

            System.out.println("Исходный массив:");
            for (int d: mASSiv){
                System.out.print(d);
            }
            System.out.println("");
            Arrays.sort(mASSiv);
            System.out.println("Отсортированный массив:");
            for (int d: mASSiv){
                System.out.print(d);
            }
            System.out.println("");

            int[] partone = Arrays.copyOfRange(mASSiv,0, 5);
            int[] parttwo = Arrays.copyOfRange(mASSiv,10, 15);
            System.out.println("Отсортированный и уророченный из середины массив:");

            int[]mASSive2 = new int[partone.length+parttwo.length];
            int count = 0;
            for(int i = 0; i<partone.length; i++) {
                mASSive2[i] = partone[i];
                count++;
            }
            for(int j = 0;j<parttwo.length;j++) {
                mASSive2[count++] = parttwo[j];
            }
            for(int i = 0;i<mASSive2.length;i++)
                System.out.print(mASSive2[i]);
            }
        }
