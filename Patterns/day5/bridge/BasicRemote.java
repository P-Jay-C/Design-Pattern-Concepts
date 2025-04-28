package day5.bridge;

public class BasicRemote extends Remote{
    protected BasicRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

}
