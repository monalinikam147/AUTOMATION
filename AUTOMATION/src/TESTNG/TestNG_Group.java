package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Group {
	
	@Test(groups = "Gmail")
	
	public void TC1()
	{
		Reporter.log("Running TC1", true);
	}
	
	
   @Test(groups = "facebook")
	
	public void TC2()
	{
		Reporter.log("Running TC2", true);
	}


   @Test(groups = "flipkart")

   public void TC3()
   {
	Reporter.log("Running TC3", true);
   }
   
   
   @Test(groups = "Gmail")
	
	public void TC4()
	{
		Reporter.log("Running TC4", true);
	}
   
   
   @Test(groups = "Gmail")
	
	public void TC5()
	{
		Reporter.log("Running TC5", true);
	}
   
   
   @Test(groups = "flipkart")
	
	public void TC6()
	{
		Reporter.log("Running TC6", true);
	}
   
   @Test(groups = "Gmail")
	
	public void TC7()
	{
		Reporter.log("Running TC7", true);
	}






}
