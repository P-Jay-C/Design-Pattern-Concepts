package day5.bridge;

public abstract class Remote {
    protected Device device;

    protected Remote(Device device) {
        this.device = device;
    }

    public void power() {
        device.turnOn();
    }

    public void volumeUp() {
        device.setVolume(10);
    }

}
