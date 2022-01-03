package com.codewithmosh.commandtest;

import com.codewithmosh.command.BlackAndWhiteCommand;
import com.codewithmosh.command.CompositeCommand;
import com.codewithmosh.command.ResizeCommand;

public class Main {

	public static void main(String[] args) {
		var composite = new CompositeCommand();
		composite.add(new ResizeCommand());
		composite.add(new BlackAndWhiteCommand());
		composite.execute();
	}
}
