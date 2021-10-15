package com.company.Lect2Homework3;

public class Barcelona extends LaLiga{

    @Override
    public void scored(){
        System.out.println("WOWOWOW WHAT A GOAL!!!!!");
    }

    @Override
    public void missed(){
        System.out.println("Это всё потому что Месси продали...");
    }
}