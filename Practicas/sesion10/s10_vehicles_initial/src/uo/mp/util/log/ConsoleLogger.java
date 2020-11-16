package uo.mp.util.log;


/**
 * A basic implementation of a Logger that simply sends the log messages 
 * to the error output stream
 */
public class ConsoleLogger implements Logger {

	@Override
	public void log(String msg) {
		System.err.println( msg );
	}

}
