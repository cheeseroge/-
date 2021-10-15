package com.company.Lect2Homework3;

public class PremierLeague extends Football {
    @Override
    public void scored() {
        System.out.println("Briliant goal!!");
    }
    @Override
    public  void missed(){
        System.out.println("F$*K!");
    }
}