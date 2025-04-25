package day3.abstractFactory;

public class VictorianTable implements Table{
    @Override
    public void placeItem(){
        System.out.println("Placing item on Victorian table");
    }
}
