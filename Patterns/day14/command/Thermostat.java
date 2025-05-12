package day14.command;

// Receiver class
public class Thermostat {
    private int temperature;

    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Thermostat set to " + temperature + " degrees.");
    }

    public void resetTemperature(int previous){
        this.temperature = previous;
        System.out.println("Thermostat reset to default temperature of 20 degrees.");
    }

    public int getTemperature() {
        return temperature;
    }
}
