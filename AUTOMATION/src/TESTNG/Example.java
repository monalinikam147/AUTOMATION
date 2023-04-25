package TESTNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.log4testng.Logger;

public class Example {
	
	
	
	public static final Logger logger = Logger.getLogger(Example.class);
	
	public static void main(String[] args) {
		logger.debug("Debug message");
		logger.info("Info message");
		logger.warn("Warn message");
		logger.error("Error message");
		logger.fatal("Fatal message");
		
	}

}


