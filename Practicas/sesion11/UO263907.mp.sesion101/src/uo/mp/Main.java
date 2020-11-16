package uo.mp;

import java.io.Console;
import java.io.IOException;

import uo.mp.ui.UserInterface;
import uo.mp.util.log.AppLog;
import uo.mp.util.log.ConsoleLogger;

public class Main {

	public static void main(String[] args) {
		new Main()
			.configure()
			.run();
	}

	private Main configure() {
		AppLog.logger = new ConsoleLogger();
		return this;
	}

	private void run() {
		try {
			new UserInterface().show();
		} catch (RuntimeException rte) {
			AppLog.logger.log(rte.getMessage());
		}
	}

}
