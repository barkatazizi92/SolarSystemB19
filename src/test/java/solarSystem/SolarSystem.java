package solarSystem;

public class SolarSystem {
    public static void main(String[] args) {

        SolarSystemBase solarSystemBase = new SolarSystemBase();
        solarSystemBase.sun="1";
        solarSystemBase.planet="2";
        solarSystemBase.star="3";
        System.out.println("the solar system is ready");

        featureSun fe = new featureSun();
        fe.color="pink";
        fe.temp="23r5434";
        fe.size="Okm";

        planet2 p2 = new planet2();
        p2.color ="green";
        p2.size ="1m";
        p2.radius ="3m";
    }
}
