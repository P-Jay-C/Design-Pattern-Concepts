package day3.facade;

public class FacadeTest {
    public static void main(String[] args) {
        // Create a facade instance
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        // Use the facade to watch a movie
        homeTheater.watchMovie("Inception");
        System.out.println();
        homeTheater.endMovie();

    }

}
