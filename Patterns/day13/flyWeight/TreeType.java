package day13.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class TreeType {
    private String species;
    private String color;

    public TreeType(String species, String color) {
        this.species = species;
        this.color = color;
    }

    public void render(int x, int y) {
        System.out.println("Rendering " + species + " tree (" + color + ") at (" + x + ", " + y + ")");
    }
}

