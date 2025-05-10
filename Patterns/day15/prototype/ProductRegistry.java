package day15.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
    private static Map<String, Product> prototypes = new HashMap<>();

    public static void registerPrototype(String type, Product prototype) {
        prototypes.put(type, prototype);
    }

    public static Product getPrototype(String type) {
        Product prototype = prototypes.get(type);

        if(prototype == null) {
            return null;
        }

        return prototype.clone();
    }
}
