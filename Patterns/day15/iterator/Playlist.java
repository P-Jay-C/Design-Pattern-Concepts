package day15.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song){
        songs.add(song);
    }

    public Iterator<Song> getForwardIterator(){
        return new SongIterator(songs, false);
    }

    public Iterator<Song> getReverseIterator(){
        return new SongIterator(songs,true);
    }
}
