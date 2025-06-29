package day8.abstractfactory;

public class MacOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextField createTextField() {
        return new MacOSTextField();
    }
}
