package abstractfactory.material;

import abstractfactory.Button;

public class MaterialButton implements Button {
	@Override
	public void render() {
		System.out.println("material button");
	}
}
