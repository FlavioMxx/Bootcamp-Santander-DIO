package edu.flaviomxx.praticando;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.decreanseVolume();
        smartTV.decreanseVolume();
        smartTV.decreanseVolume();
        smartTV.increanseVolume();

        System.out.println("A TV está ligada? " + (smartTV.isOn ? "Sim!" : "Não!"));
        System.out.println("Canal: " + smartTV.channel);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.goToChannel(13);
        System.out.println("Canal: " + smartTV.channel);

        smartTV.turnOn();
        System.out.println("A TV está ligada? " + (smartTV.isOn ? "Sim!" : "Não!"));

        smartTV.turnOff();
        System.out.println("A TV está ligada? " + (smartTV.isOn ? "Sim!" : "Não!"));
    }
}
