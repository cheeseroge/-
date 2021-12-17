package com.company.Classwork5;

import java.util.ArrayList;
import java.util.Collection;

public class Classwork5 {

    static <T> void printArray(T[] a) {
        for (T element : a) {
            System.out.print(element);
        }
    }
    static <T> void printCollection(Collection<T> c) {
        for (T element : c) {
            System.out.print(element);
        }
    }

    public static void main(String[] args) {
        Object[] strArr = new Object [] {"Воу ", "что ", "за ", "приколы. "};
        Object[] strArr2 = new Object [] {1,2,3,4};

        Collection<Object> objColl = new ArrayList<>();
        objColl.add("Почему бы ");
        objColl.add("не сделать ");
        objColl.add("это. ");

        Collection<Object> objColl2 = new ArrayList<>();
        objColl.add("Но только ");
        objColl.add("через ");
        objColl.add("СистемаутПринтлн");

        printArray(strArr);
        printCollection(objColl);
        System.out.println();
        printArray(strArr2);
        printCollection(objColl2);
    }
}
