package factory.pana;

import java.util.Map;
import factory.testengine.ViewEngine;

public class PanaViewEngine implements ViewEngine {
	@Override
	public String render(String viewName, Map<String, Object> data) {
		return "view rendered by PanaEngine";
	}

}
