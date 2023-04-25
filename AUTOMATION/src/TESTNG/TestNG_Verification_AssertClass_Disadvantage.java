package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verification_AssertClass_Disadvantage {
	
	//Hard Assert
	
	@Test
	public void test()
	{
       String expResult = "good morning";
       String actResult = "good night";
       boolean result = false;
       
       
       //verification 1
       Assert.assertNotEquals(actResult, expResult, "Verification 1: act and exp result is same");
       
       //verification 2
       Assert.assertEquals(actResult, expResult, "Verification 2: act and exp is different");

       //verification 3
       Assert.assertTrue(result, "result is false");
	}

}
