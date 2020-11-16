package uo.mp.util.log;

/**
 * Represents any system able to register a log
 */
public interface Logger {

	/**
	 * Records the message string received in a log subsystem
	 * This message will be appended as the last message on the log
	 * @param msg
	 */
	void log(String msg);

}
