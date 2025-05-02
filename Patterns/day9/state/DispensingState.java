package day9.state;

public class DispensingState implements State {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Dispensing in progress.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Dispensing in progress.");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Dispensing product.");
        machine.setState(new NoCoinState());
    }
}
