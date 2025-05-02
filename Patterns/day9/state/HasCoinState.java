package day9.state;

public class HasCoinState implements State {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Product selected.");
        machine.setState(new DispensingState());
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Select product first.");
    }
}
