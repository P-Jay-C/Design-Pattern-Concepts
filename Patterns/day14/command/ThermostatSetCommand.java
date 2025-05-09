package day14.command;

public class ThermostatSetCommand implements Command{

    private Thermostat thermostat;
    private int temperature;
    private int previousTemperature;

    public ThermostatSetCommand(Thermostat thermostat, int  temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
        this.previousTemperature = thermostat.getTemperature(); // Assuming getTemperature() method exists
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }

    @Override
    public void undo() {
        thermostat.resetTemperature(previousTemperature);
    }
}
