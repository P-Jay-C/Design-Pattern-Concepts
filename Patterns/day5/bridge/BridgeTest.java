package day5.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote basicRemote = new BasicRemote(tv);
        Remote advancedRemote = new AdvancedRemote(tv);

        basicRemote.power();
        basicRemote.volumeUp();
        ((BasicRemote) basicRemote).mute();

        advancedRemote.power();
        ((AdvancedRemote) advancedRemote).channelUp();

        Device radio = new Radio();
        Remote radioRemote = new BasicRemote(radio);
        radioRemote.power();
        radioRemote.volumeUp();
    }
}
