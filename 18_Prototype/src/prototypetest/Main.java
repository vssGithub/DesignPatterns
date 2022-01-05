package prototypetest;

import prototype.Circle;
import prototype.ContextMenu;
import prototype.Square;

public class Main {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(10);
		
		Square square1 = new Square();
		square1.setWidth(20);
		
		ContextMenu testContextMenu = new ContextMenu();
		testContextMenu.duplicate(circle1);
		testContextMenu.duplicate(square1);
	}

}
