package day13.abstractFactory;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Menu createMenu() {
        return new LightMenu();
    }
}
