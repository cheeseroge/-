package com.company.Lect2Homework3;

public class Bundesliga extends Football {
    @Override
    public void scored() {
        System.out.println("Ausgezeichnet goal!");
    }
    @Override
    public  void missed(){
        System.out.println("*ругается по-немецки*");
    }
}