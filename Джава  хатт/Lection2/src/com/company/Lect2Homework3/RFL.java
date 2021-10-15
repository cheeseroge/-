package com.company.Lect2Homework3;

public class RFL extends Football {

    @Override
    public void scored() {
        System.out.println("ОГОГО, ЧТО ЗА ГОЛ!!!");
    }
    @Override
    public  void missed(){
        System.out.println("Ээээх, пропускаем");
    }
}