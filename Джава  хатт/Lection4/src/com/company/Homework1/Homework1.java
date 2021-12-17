package com.company.Homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        boolean proverk = false;
        Map<String,Planet> planets = new HashMap<>();
        planets.put("Меркурий", new Planet(0, 	2439.7, 0.147));
        planets.put("Венера", new Planet(0, 6051.8 , 0.902));
        planets.put("Земля", new Planet(1, 6371.0, 1));
        planets.put("Марс", new Planet(2, 3389.5, 0.283));
        planets.put("Юпитер", new Planet(79, 69911, 121.9));
        planets.put("Сатурн", new Planet(82, 	58232, 95.2));
        planets.put("Уран", new Planet(27, 25362, 15.91));
        planets.put("Нептун", new Planet(14, 24622, 14.98));

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи название планеты из Солнечно системы, про которую хочешь получить инфу:");
        String newPlanet = sc.nextLine();


        for (String key : planets.keySet()) {
            if (newPlanet.equals(key)) {
                proverk = true;
                System.out.println("Название: " + key);
                System.out.println("Количество спутников: " + planets.get(key).getSputnik());
                System.out.println("Средний радиус: " + planets.get(key).getRadius());
                System.out.println("Площадь поверхности: " + planets.get(key).getSquare() + " земной поверхности");
            }
        }
        if (newPlanet.equals("Плутон")) {
            System.out.println("Жители Плутона благодарны тебе, но, к сожалению, земляне не считают её Солнечной системой:((");
            System.out.print("Поэтому ");
        }
        if (!proverk){
            System.out.println("такой планеты нет в списке");
        }
    }
}