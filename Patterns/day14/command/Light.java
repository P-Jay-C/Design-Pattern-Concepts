package day14.command;

// Receiver class
public class Light {
    private boolean inOn;

    public void turnOn() {
        inOn = true;
        System.out.println("Light is ON");
    }

    public void turnOff() {
        inOn = false;
        System.out.println("Light is OFF");
    }

}
