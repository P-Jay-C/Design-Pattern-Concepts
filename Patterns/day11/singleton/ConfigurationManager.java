package day11.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private Map<String, String> settings;

    private ConfigurationManager() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() to get the single instance");
        }
        settings = new HashMap<>();
        settings.put("apiKey", "default-key");
        settings.put("timeout", "5000");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}

