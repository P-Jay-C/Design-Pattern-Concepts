package day3.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args){
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        modernChair.sit();
        modernTable.placeItem();

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();

        victorianChair.sit();
        victorianTable.placeItem();
    }
}
