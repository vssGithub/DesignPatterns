package observertest;

import observer.Chart;
import observer.DataSource;
import observer.Spreadsheet;

public class Main {

	public static void main(String[] args) {
		var dataSource = new DataSource();
		var sheet1 = new Spreadsheet(dataSource);
		var sheet2 = new Spreadsheet(dataSource);
		var chart = new Chart(dataSource);
		
		dataSource.addObserver(sheet1);
		dataSource.addObserver(sheet2);
		dataSource.addObserver(chart);
		
		dataSource.setValue(12);
		dataSource.setValue(32);
		
		dataSource.removeObserver(sheet2);
		
		dataSource.setValue(5);
	}

}
