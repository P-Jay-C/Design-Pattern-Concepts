package day1.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<NewsChannel> channels = new ArrayList<>();
    private String headline;

    public void addChannel(NewsChannel channel){
        channels.add(channel);
    }

    public void removeChannel(NewsChannel channel){
        channels.remove(channel);
    }

    public void setHeadline(String headline){
        this.headline = headline;
        notifyChannels();
    }

    private void notifyChannels(){
        for(NewsChannel channel: channels){
            channel.update(headline);
        }
    }

}
