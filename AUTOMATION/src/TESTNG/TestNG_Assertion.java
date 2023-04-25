package TESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertion {
	
    //AssertEquals
	@Test
	public void test1()
	{
		Reporter.log("running test1 method", true);
		String expResult = "Good night";
		String actResult = "Good night";
		
		
		Assert.assertEquals(actResult, expResult,"act and exp not equal");

     }
	
	//AssertNotEquals
	@Test
	public void test2()
	{
		Reporter.log("running test2 method", true);
		String expResult = "Good night";
		String actResult = "Good night1";
		
		Assert.assertNotEquals(actResult, expResult, "act and exp result is similar");
	}
	
	//AssertTrue
	@Test
	public void test3()
	{
		Reporter.log("running test3 method", true);
		boolean reasult = true;
		
		Assert.assertTrue(reasult, "result is false");
	}
	
	//AssertFalse
	@Test
	public void test4()
	{
		Reporter.log("running test4 method", true);
		boolean reasult = true;
		
        Assert.assertFalse(reasult, "result is true");		
	
    }
	//AssertNull
	@Test
	public void test5()
	{
		Reporter.log("running test5 method", true);
		String reasult = "fjhahsjah";
		
        Assert.assertNull(reasult,"result is not null");	
    }
	
	//AssertNotNull
	@Test
	public void test6()
	{
		Reporter.log("running test6 method", true);
		String reasult = "";
		

		Assert.assertNotNull(reasult, "reasult is null");
		}
	
	//AssertFail
		@Test
		public void test7()
		{
			Reporter.log("running test7 method", true);
			Assert.fail();
	}
	
}