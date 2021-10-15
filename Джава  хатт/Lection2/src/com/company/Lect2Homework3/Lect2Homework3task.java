package com.company.Lect2Homework3;

import com.company.Lect2Homework3.*;

public class Lect2Homework3task {

    public static void main(String[] args) {

        Football league1 = new LaLiga();
        Football league2 = new Bundesliga();
        Football league3 = new RFL();
        Football league4 = new PremierLeague();
        LaLiga club1 = new Barcelona();

        club1.missed();
        league2.scored();
        league3.scored();
        league4.scored();
    }
}