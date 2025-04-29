package day6.flyweight;

public class FlyweightTest {
    public static void main(String[] args){
        Forest forest = new Forest();
        forest.plantTree(1, 1, "Oak", "Rough");
        forest.plantTree(2, 3, "Oak", "Rough");
        forest.plantTree(5, 4, "Pine", "Smooth");

        forest.draw();
    }
}
