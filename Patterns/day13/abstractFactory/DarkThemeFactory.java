package day13.abstractFactory;

public class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
