package observer;

public class Chart implements Observer {

	@Override
	public void update() {
		System.out.println("chart notified");
	}
}