package day1.observer;

public class ObserverTest {
    public static void main(String[] args){
        NewsAgency agency = new NewsAgency();

        TVNewChannel channel1 = new TVNewChannel("CNN");
        TVNewChannel channel2 = new TVNewChannel("BBC");

        agency.addChannel(channel1);
        agency.addChannel(channel2);

        agency.setHeadline("Breaking: Major even reported!");

        agency.removeChannel(channel2);
        agency.setHeadline("Update: Event details released");
    }
}
