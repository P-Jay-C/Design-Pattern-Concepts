package day14.command;

public class CommandTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOnCommand = new LightOnCommand(light);
        Command thermostatSetCommand = new ThermostatSetCommand(thermostat, 22);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton(); // Light should turn on
        remoteControl.pressUndo(); // Light should turn off

        remoteControl.setCommand(thermostatSetCommand);
        remoteControl.pressButton(); // Thermostat should set to 22
        remoteControl.pressUndo(); // Thermostat should reset to previous temperature


    }
}
