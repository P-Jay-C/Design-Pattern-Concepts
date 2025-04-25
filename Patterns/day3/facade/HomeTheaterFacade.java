package day3.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(80);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting down the home theater...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
    }
}
