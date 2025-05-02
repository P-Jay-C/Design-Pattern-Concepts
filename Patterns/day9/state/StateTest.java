package day9.state;

public class StateTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.insertCoin();
        machine.selectProduct();
        machine.dispense();

        System.out.println("\n\nInvalid operation");
        machine.dispense();

        System.out.println("\nAnother cycle:");
        machine.insertCoin();
        machine.insertCoin();
        machine.selectProduct();
        machine.dispense();
    }
}
