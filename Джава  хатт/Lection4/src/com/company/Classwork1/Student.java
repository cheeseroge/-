package com.company.Classwork1;
class Student {
    private String name;
    private int age;
    private double averageScore;
    Student (String a, int b, double c) {
        this.name = a;
        this.age = b;
        this.averageScore = c;
    }
    String getName () {
        return name;
    }
    int getAge () {
        return age;
    }
    double getAverageScore() {
        return averageScore;
    }
}