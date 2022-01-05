package prototype;

public class Circle implements Component {
	private int radius;
	
	@Override
	public void render() {
		System.out.println("Render a circle");
	}

	@Override
	public Component clone() {
		Circle newCircle = new Circle();
		newCircle.setRadius(radius);
		return newCircle;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
