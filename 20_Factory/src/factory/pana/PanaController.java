package factory.pana;

import factory.testengine.Controller;
import factory.testengine.ViewEngine;

public class PanaController extends Controller {
	@Override
	protected ViewEngine createViewEngine() {
		return new PanaViewEngine();
	}
}
