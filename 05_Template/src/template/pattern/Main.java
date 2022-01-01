package template.pattern;

import template.GenerateReport;
import template.TransferMoneyTask;

public class Main {

	public static void main(String[] args) {
		var task = new TransferMoneyTask();
		//var task = new GenerateReport();
		task.execute();
	}

}
