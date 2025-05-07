package day13.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ThemeFactory darkFactory = new DarkThemeFactory();
        Button darkButton = darkFactory.createButton();
        Menu darkMenu = darkFactory.createMenu();
        darkButton.render();
        darkMenu.render();

        ThemeFactory lightFactory = new LightThemeFactory();
        Button lightButton = lightFactory.createButton();
        Menu lightMenu = lightFactory.createMenu();
        lightButton.render();
        lightMenu.render();
    }
}
