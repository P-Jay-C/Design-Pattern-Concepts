package day6.flyweight;



import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String species, String texture){
        TreeType type = TreeFactory.getTreeType(species,texture);
        trees.add(new Tree(x, y, type));
    }

    public void draw() {
        for(Tree tree : trees){
            tree.draw();
        }
    }
}
