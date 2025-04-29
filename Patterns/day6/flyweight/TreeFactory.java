package day6.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String species, String texture){

        String key = species + "_"+ texture;
        TreeType treeType = treeTypes.get(key);
        if(treeType == null){
            treeType = new TreeType(species,texture);
            treeTypes.put(key, treeType);
        }
        return treeType;
    }
}
