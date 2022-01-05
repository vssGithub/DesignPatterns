package factory.testengine;

import java.util.Map;

public class Controller {
	public void render(String viewName, Map<String, Object> data) {
		var testEngine = createViewEngine();
		var html = testEngine.render(viewName, data);
		System.out.println(html);
	}
	
	protected ViewEngine createViewEngine() {
		return new TestViewEngine();
	}
}
