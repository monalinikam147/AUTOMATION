package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test //mark a class or a method as part of the test
	
		public void test()
		{
			System.out.println("running test method");//msg will display only console not in report
			Reporter.log("running test method", false);//msg will display on report not on console
			Reporter.log("running test method", true);//msg will display console or report also
		}
	}


