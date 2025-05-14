package day17.facade;

public class FacadeTest {
    public static void main(String[] args) {
        MediaConverterFacade facade = new MediaConverterFacade();
        facade.convertMedia("sample.mp4", "AVI");
    }
}