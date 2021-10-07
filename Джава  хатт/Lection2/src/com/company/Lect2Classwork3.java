package com.company;
import java.util.Scanner;
public class Lect2Classwork3 {

    public static void main(String[] args) {
        A aClass = new A();
        B bClass = new B();
        C cClass = new C();
        D dClass = new D();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение а: ");
        int a = in.nextInt();
        System.out.print("Введите значение b: ");
        int b = in.nextInt();

        aClass.count(a, b);
        aClass.show();

        bClass.count(a, b);
        bClass.show();

        cClass.count(a, b);
        cClass.show();

        dClass.count(a, b);
        dClass.show();
    }
}

class A {
    public int count(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
        return a + b;
    }

    public void show(){
        System.out.println("A\n");
    }
}

class B extends A {
    @Override
    public int count(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
        return a - b;
    }

    @Override
    public void show(){
        System.out.println("B\n");
    }
}

class C extends A{
    @Override
    public int count(int a, int b){
        System.out.println(a + " * " + b + " = " + (a * b));
        return a * b;
    }

    @Override
    public void show(){
        System.out.println("C\n");
    }
}

class D extends B{
    @Override
    public int count(int a, int b){
        System.out.println(a + " / " + b + " = " + (a / b));
        return a / b;
    }

    @Override
    public void show(){
        System.out.println("D\n");
    }
}