package day13.flyWeight;

public class FlyweightTest {
    public static void main(String[] args) {
        TreeType oakGreen = TreeFactory.getTreeType("Oak", "Green");
        TreeType pineBrown = TreeFactory.getTreeType("Pine", "Brown");
        TreeType oakYellow = TreeFactory.getTreeType("Oak", "Yellow");

        Tree tree1 = new Tree(10, 20, oakGreen);
        Tree tree2 = new Tree(15, 25, oakGreen);
        Tree tree3 = new Tree(30, 40, pineBrown);
        Tree tree4 = new Tree(50, 60, oakYellow);

        tree1.render();
        tree2.render();
        tree3.render();
        tree4.render();

        System.out.println("Total TreeTypes created: " + TreeFactory.treeTypes.size());
    }
}