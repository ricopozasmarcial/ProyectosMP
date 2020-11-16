package uo.mp;

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
		new UserInterface().show();
	}

}
