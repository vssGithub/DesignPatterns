package abstractfactory.ant;

import abstractfactory.Button;

public class AntButton implements Button {
	@Override
	public void render() {
		System.out.println("ant button");
	}
}
