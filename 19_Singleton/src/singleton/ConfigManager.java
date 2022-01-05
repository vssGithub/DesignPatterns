package singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
	private Map<String, Object> settingsMap = new HashMap<>();
	private static ConfigManager instance = new ConfigManager();
	
	private ConfigManager() {
	}
	
	public void set(String key, Object value) {
		settingsMap.put(key, value);
	}
	
	public Object get(String key) {
		return settingsMap.get(key);
	}

	public static ConfigManager getInstance() {
		return instance;
	}
}
