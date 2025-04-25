package day3.abstractFactory;

public class ModernTable implements Table {
   @Override
    public void placeItem() {
        System.out.println("Placing item on a modern table");
    }
}
