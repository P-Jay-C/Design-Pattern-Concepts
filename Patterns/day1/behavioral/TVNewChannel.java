package day1.behavioral;

public class TVNewChannel implements NewsChannel{

    private String channelName;

    public TVNewChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String headline) {
        System.out.println(channelName + " received headline: " + headline);
    }

}
