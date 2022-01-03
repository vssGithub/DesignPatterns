package observer;

public class Spreadsheet implements Observer {
	private DataSource dataSource;
	
	public Spreadsheet(DataSource datasource) {
		this.dataSource = datasource;
	}

	@Override
	public void update() {
		System.out.println("spreadsheet notified: " + dataSource.getValue());
	}
}