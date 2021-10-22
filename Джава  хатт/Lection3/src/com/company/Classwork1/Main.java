package com.company.Classwork1;

public class Main {

    public static void main(String[] args) {
        Apple oneApple = new Apple();
        Orange oneOrange = new Orange();
        Banana oneBanana = new Banana();

        System.out.println(oneApple.getName() + "; " + oneApple.getWeight() + "; " + oneApple.isTasty());
        System.out.println(oneBanana.getName() + "; " + oneBanana.getWeight() + "; " + oneBanana.isTasty());
        System.out.println(oneOrange.getName() + "; " + oneOrange.getWeight() + "; " + oneOrange.isTasty());
    }
}