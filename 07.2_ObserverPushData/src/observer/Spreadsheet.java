package observer;

public class Spreadsheet implements Observer {

	@Override
	public void update(int value) {
		System.out.println("spreadsheet notified: " + value);
	}
}