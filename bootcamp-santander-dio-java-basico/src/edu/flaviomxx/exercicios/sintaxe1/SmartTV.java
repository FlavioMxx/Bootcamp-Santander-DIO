package edu.flaviomxx.praticando;

public class SmartTV {
    public boolean isOn = false;
    public int channel = 1;
    public int volume = 25;

    final int MAX_VOLUME = 100;
    final int MIN= 0;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increanseVolume() {
        volume++;
        System.out.println("Aumentando volume - " + volume);
    }

    public void decreanseVolume() {
        volume--;
        System.out.println("Abaixando volume - " + volume);
    }

    public void goUpChannel() {
        channel++;
    }

    public void goDownChannel() {
        channel--;
    }

    public void goToChannel(int requiredChannel) {
        channel = requiredChannel;
    }
}
