package day15.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song A", "Artist 1"));
        playlist.addSong(new Song("Song B", "Artist 2"));
        playlist.addSong(new Song("Song C", "Artist 3"));

        System.out.println("Forward Iteration:");
        Iterator<Song> forwardIterator = playlist.getForwardIterator();

        while (forwardIterator.hasNext()){
            System.out.println(forwardIterator.next());
        }

        System.out.println("\nReverse Iteration:");
        Iterator<Song> reverseIterator = playlist.getReverseIterator();
        while(reverseIterator.hasNext()){
            System.out.println(reverseIterator.next());
        }

    }
}