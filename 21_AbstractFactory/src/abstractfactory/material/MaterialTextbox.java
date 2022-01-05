package abstractfactory.material;

import abstractfactory.TextBox;

public class MaterialTextbox implements TextBox {
	@Override
	public void render() {
		System.out.println("material textbox");
	}
}
