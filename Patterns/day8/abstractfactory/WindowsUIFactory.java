package day8.abstractfactory;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WndowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
