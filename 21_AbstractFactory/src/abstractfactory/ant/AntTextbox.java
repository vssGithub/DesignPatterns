package abstractfactory.ant;

import abstractfactory.TextBox;

public class AntTextbox implements TextBox{
	@Override
	public void render() {
		System.out.println("ant textbox");
	}
}
