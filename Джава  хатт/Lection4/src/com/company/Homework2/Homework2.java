package com.company.Homework2;
import java.util.*;

public class Homework2 {

    public static void main(String[] args) {

        boolean check = false;

        Map<String, ArrayList<Double>> planetsMap = new HashMap<String, ArrayList<Double>>();
        ArrayList<Double> merc = new ArrayList<Double>();
        merc.add(0.0);
        merc.add(2439.7);
        merc.add(0.147);
        planetsMap.put("Меркурий", merc);
        ArrayList<Double> ven = new ArrayList<Double>();
        ven.add(0.0);
        ven.add(6051.8);
        ven.add(0.902);
        planetsMap.put("Венера", ven);
        ArrayList<Double> zem = new ArrayList<Double>();
        zem.add(1.0);
        zem.add(6371.0);
        zem.add(1.0);
        planetsMap.put("Земля", zem);
        ArrayList<Double> mars = new ArrayList<Double>();
        mars.add(2.0);
        mars.add(3389.5);
        mars.add(0.283);
        planetsMap.put("Марс", mars);
        ArrayList<Double> jup = new ArrayList<Double>();
        jup.add(79.0);
        jup.add(69911.0);
        jup.add(121.9);
        planetsMap.put("Юпитер", jup);
        ArrayList<Double> sat = new ArrayList<Double>();
        sat.add(82.0);
        sat.add(58232.0);
        sat.add(95.2);
        planetsMap.put("Сатурн", sat);
        ArrayList<Double> ur = new ArrayList<Double>();
        ur.add(27.0);
        ur.add(25362.0);
        ur.add(15.91);
        planetsMap.put("Уран", ur);
        ArrayList<Double> nep = new ArrayList<Double>();
        nep.add(14.0);
        nep.add(24622.0);
        nep.add(14.98);
        planetsMap.put("Нептун", nep);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи название планеты из Солнечно системы, про которую хочешь получить инфу:");
        String Planet = sc.nextLine();

            if (planetsMap.containsKey(Planet)) {
                check = true;
                System.out.println("Название: [Количество спутников / средний радиус / площадь поверхности]: " + Planet + ": " + planetsMap.get(Planet).toString());
            }

        if (Planet.equals("Плутон")) {
            System.out.println("Жители Плутона благодарны тебе, но, к сожалению, земляне не считают её Солнечной системой:((");
            System.out.print("Поэтому ");
        }
        if (!check){
            System.out.println("такой планеты нет в списке");
        }
    }
}