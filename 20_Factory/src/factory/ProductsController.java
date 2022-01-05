package factory;

import java.util.HashMap;
import java.util.Map;

import factory.testengine.Controller;

public class ProductsController extends Controller {
	public void listProducts() {
		// query db for products
		Map<String, Object> data = new HashMap<>();
		// data.put(products)
		
		render("products.html", data);
	}
}
