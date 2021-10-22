package com.company.Homework1;

public class Main {

    public static void main(String[] args) {
        NumberParams number1 = new NumberParams(5, 7);
        NumberParams number2 = new NumberParams(4, 2);

        System.out.println("Обычное число #1 + Обычное число #2 = " + new Numbers().add(number1, number2).getReal() + "\n" +
                "Обычное число #1 - Обычное число #2 = " + new Numbers().subtract(number1, number2).getReal() + "\n" +
                "Обычное число #1 * Обычное число #2 = " + new Numbers().multiply(number1, number2).getReal() + "\n" +
                "Обычное число #1 / Обычное число #2 = " + new Numbers().divide(number1, number2).getReal() + "\n");

        NumberParams addition = new ComplexNumbers().add(number1, number2);
        NumberParams subtraction = new ComplexNumbers().subtract(number1, number2);
        NumberParams division = new ComplexNumbers().divide(number1, number2);
        NumberParams multiplication = new ComplexNumbers().multiply(number1, number2);

        System.out.println("Комплексное число #1 + Комплексное число #2 = " + addition.getReal() + " + " + addition.getImaginary() + "i\n" +
                "Комплексное число #1 - Комплексное число #2 = " + subtraction.getReal() + " + " + subtraction.getImaginary() + "i\n" +
                "Комплексное число #1 * Комплексное число #2 = " + multiplication.getReal() + " + " + multiplication.getImaginary() + "i\n" +
                "Комплексное число #1 / Комплексное число #2 = " + division.getReal() + " + " + division.getImaginary() + "i\n");
    }
}