package day8.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {


        UIFactory windowFactory = new WindowsUIFactory();
        Button windowsButton = windowFactory.createButton();
        TextField windowsTextField = windowFactory.createTextField();

        windowsButton.render();
        windowsTextField.render();

        UIFactory macFactory = new MacOSUIFactory();
        Button macButton = macFactory.createButton();
        TextField macTextField = macFactory.createTextField();

        macButton.render();
        macTextField.render();

    }
}
