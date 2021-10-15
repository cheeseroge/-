package com.company.Lect2Homework3;

public class LaLiga extends Football {

    @Override
    public void scored() {
        System.out.println("What a goal!");
    }

    @Override
    public  void missed(){
        System.out.println("*ругается по-испански*");
    }
}