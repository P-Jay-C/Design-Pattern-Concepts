package day5.bridge;

public class TV implements Device{
    private int volume = 50;
    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }

}
