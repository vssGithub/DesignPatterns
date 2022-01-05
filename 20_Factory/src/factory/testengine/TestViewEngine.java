package factory.testengine;

import java.util.Map;

public class TestViewEngine implements ViewEngine {
	@Override
	public String render(String viewName, Map<String, Object> data) {
		return "view rendered by TestEngine";
	}
}
