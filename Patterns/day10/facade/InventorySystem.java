package day10.facade;

public class InventorySystem {
    public boolean checkStock(String item, int quantity) {
        System.out.println("Checking stock for " + item + ": " + quantity + " available");
        return true;
    }

    public void reserveStock(String item, int quantity) {
        System.out.println("Reserving " + quantity + " of " + item);
    }
}

