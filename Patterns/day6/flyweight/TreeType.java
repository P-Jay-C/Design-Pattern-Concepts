package day6.flyweight;

public class TreeType {
    private final String texture;
    private final String species;

    public TreeType(String species, String texture){
        this.species = species;
        this.texture = texture;
    }

    public void draw(int x, int y){
        System.out.println("Drawing " + species + " tree with " + texture + " at (" + x + ", " + y + ")");    }
}
