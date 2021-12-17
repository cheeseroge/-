package com.company.Classwork4;

import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class Classwork4 {
    public static void main(String[] args) {
        Map<String, Integer> bombard = new HashMap<String, Integer>();
        bombard.put("Гамид Агаларов", 13);
        bombard.put("Артём Дзюба", 10);
        bombard.put("Матео Кассьерра", 7);
        bombard.put("Сердар Азмун", 6);
        bombard.put("Фёдор Смолов", 5);

        System.out.println("Список лучших бомбардиров РПЛ после 15-ого тура:");
        for (Object key : bombard.keySet()) {
            System.out.println(key + " - " + bombard.get(key));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Чью статистику хочешь посмотреть?");
        String player = sc.nextLine();

        if (bombard.containsKey(player)) {
            System.out.println(player + " забил " + bombard.get(player) + " голов");
        } else {
            System.out.println("Проверь, правильно ли ты написал имя, а если всё верно, то его пока нет в списке");
        }

        System.out.println("Сколько говоришь забил твой любимый игрок? ");
        String str = sc.nextLine();
        Integer goals = Integer.parseInt(str);
        if ( bombard.containsValue(goals)) {
            for (Map.Entry e :  bombard.entrySet()) {
                if (e.getValue() == goals) {
                    System.out.println("Если он забил " + goals + " голов" + " то я думаю, что это " + e.getKey());
                }
            }
        } else {
            System.out.println("Консоли за такую цену нет, но вы могли бы приобрести другую");
        }
    }
}

