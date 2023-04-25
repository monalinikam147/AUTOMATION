package TESTNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssert {
	
	@Test
	public void test()
	{
		String expResult = "Good morning";
		String actResult = "Good Night";
		boolean result = false;
		
	  SoftAssert soft = new SoftAssert();
	  
	 
	  //verification 1
	  soft.assertNotEquals(actResult, expResult, "Verification 1: act and exp is similar");
	  
	  //verification 2
	  soft.assertNotEquals(actResult, expResult, "Verification 2: act and exp is different");
	  
	  //verification3
	  soft.assertTrue(result, " verification 3: result is false");
	  
	  soft.assertAll();
	  
		
		
		
	}

}
