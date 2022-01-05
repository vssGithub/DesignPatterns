package prototype;

public class Square implements Component {
	private int width;
	
	@Override
	public void render() {
		System.out.println("Render a square");
	}

	@Override
	public Component clone() {
		Square newSquare = new Square();
		newSquare.setWidth(width);
		return newSquare;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
