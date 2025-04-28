package day5.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private final Map<String, Shape> registry = new HashMap<>();

    public void registerShape(String key, Shape shape){
        registry.put(key,shape);
    }

    public Shape getShape(String key){
        Shape shape = registry.get(key);
        return shape != null ? shape.clone() : null ;
    }

}
