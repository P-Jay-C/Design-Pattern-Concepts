package day15.iterator;

import java.util.List;

public class SongIterator implements Iterator<Song> {
    private List<Song> songs;
    private int index;
    private boolean reverse;

    public SongIterator(List<Song> songs, boolean reverse) {
        this.songs = songs;
        this.reverse = reverse;
        this.index = reverse ? songs.size() - 1: 0;
    }

    @Override
    public boolean hasNext() {
        return reverse ? index >= 0 : index < songs.size();
    }

    @Override
    public Song next() {
        Song song = songs.get(index);
        index += reverse ? -1 : 1;
        return song;
    }

}
