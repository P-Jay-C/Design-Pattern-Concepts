package day10.prototype;

import java.util.HashMap;
import java.util.Map;

public class ReportRegistory {
    private Map<String, Report> prototypes = new HashMap<>();

    public void registerPrototypes(String key, Report prototype){
        prototypes.put(key,prototype);
    }

    public Report getPrototype(String key){
        Report prototype = prototypes.get(key);
        if(prototype != null){
            return prototype.clone();
        }
        return null;
    }
}
