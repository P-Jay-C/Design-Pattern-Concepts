package day3.facade;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is now ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void off() {
        System.out.println("DVD Player is now OFF");
    }

}
