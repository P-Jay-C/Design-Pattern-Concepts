package day16.singleton;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    private static volatile CacheManager instance;
    private Map<String, String> cache;

    private CacheManager(){
        if (instance != null){
            throw new RuntimeException("Use getInstance() to get the single instance");
        }
        cache = new HashMap<>();
    }

    public static CacheManager getInstance() {

        if (instance == null){
            synchronized (CacheManager.class){
                if (instance == null){
                    instance = new CacheManager();
                }
            }
        }

        return instance;
    }

    public void put(String key, String value){
        cache.put(key,value);
    }

    public String get(String key){
        return cache.get(key);
    }
}
