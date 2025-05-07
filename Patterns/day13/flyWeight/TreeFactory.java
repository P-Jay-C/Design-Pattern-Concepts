package day13.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String species, String color) {
        String key = species + "_" + color;
        return treeTypes.computeIfAbsent(key, k -> new TreeType(species, color));
    }
}