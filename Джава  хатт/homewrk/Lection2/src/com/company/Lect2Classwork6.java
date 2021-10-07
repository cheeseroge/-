package com.company;

public class Lect2Classwork6 {
    public static void main(String[] args) {
        NetworkInfo net = NetworkInfo.setParams("88005553535", "n@g0rshk3SiddelTHEking", "normalnaya");
        net.showParameters();
    }
}

class NetworkInfo {
    String ssid;
    String password;
    String securityType;

    void showParameters() {
        System.out.println("ssid: " + ssid + "; " + "password: " + password + "; " + "securityType: " + securityType);
    }

    static NetworkInfo setParams(String ssid, String password, String securityType) {
        NetworkInfo net = new NetworkInfo();
        net.ssid = ssid;
        net.password = password;
        net.securityType = securityType;

        return net;
    }
}