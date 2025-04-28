package day5.bridge;

public class AdvancedRemote extends Remote{
    protected AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }

    public void channelUp() {
        System.out.println("Channel up (Advanced feature)");
    }

}
