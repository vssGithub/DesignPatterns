package singletontest;

import singleton.ConfigManager;

public class Main {

	public static void main(String[] args) {
		ConfigManager manager1 = ConfigManager.getInstance();
		manager1.set("test", "testValue");
		
		ConfigManager manager2 = ConfigManager.getInstance();
		System.out.println(manager2.get("test"));
	}

}
