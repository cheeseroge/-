package com.company;
import java.util.Scanner;
public class Lect2Homework1 {

    public static void main(String[] args) {

        String ans1;
        String ans2;
        String ans3;
        double maxs = 0;
        double wght = 0;
        Car car;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите модель автомобиля: ");
            String model = sc.nextLine();

            System.out.println("Нужно ли ввести максимальную скорость? (y/n)");
            ans1 = sc.next();
            if ("y".equals(ans1)) {
                System.out.print("Введите максимальную скорость: ");
                maxs = sc.nextDouble();
            }

            System.out.println("Хотите ли вы ввести максимальный вес? (y/n)");
            ans2 = sc.next();
            if ("y".equals(ans2)) {
                System.out.print("Введите вес: ");
                wght = sc.nextDouble();
            }

            if ("y".equals(ans1) && "y".equals(ans2)) {
                car = new Car(model, maxs, wght);
            }
            else if ("y".equals(ans1)) {
                car = new Car(model, maxs);
            }
            else if ("y".equals(ans2)) {
                car = new Car(model, wght);
            }
            else {
                car = new Car(model);
            }

            car.show();

            System.out.println("Ещё раз? (y/n)");

            ans3 = sc.next();
        } while (!ans3.equals("n"));
        System.out.println("Ну и пожалуйста, ну и не нужно");
    }
}

class Car {
    private String model;
    private double maxSpeed = 0;
    private double weight = 0;
    public Car(String model) {
        this.model = model;
    }

    public Car(String model, double speed) {
        this.model = model;
        this.maxSpeed = speed;
    }

    public Car(String model, double speed, double ves) {
        this.model = model;
        this.maxSpeed = speed;
        this.weight = ves;
    }

    public void show() {
        System.out.println("Модель: " + model);
        if (maxSpeed != 0) {
            System.out.println("Максимальная скорость: " + maxSpeed);
        }

        if (weight != 0) {
            System.out.println("Вес: " + weight);
        }
    }
}