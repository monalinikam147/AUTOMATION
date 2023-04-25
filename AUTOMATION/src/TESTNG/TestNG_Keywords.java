package TESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {

	/*@Test(invocationCount = 5)
	public void TC1()
	{
	    Reporter.log("running TC1");
	}*/
	
	//priority by default 2
	@Test(priority = 2)
	public void TC2()
	

	{
		Assert.fail();
		Reporter.log("runnning TC2",true);
	}
	@Test(priority = -1,dependsOnMethods = {"TC2"})
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}
	
	//enabled
	@Test(priority=-1,enabled = false)
	public void TC4()
	{
		Reporter.log("running TC4",true);
	}
	//timeOut
	@Test(timeOut=2000, dependsOnMethods = {"TC3"})
	public void TC5() throws InterruptedException
	{
		//Thread.sleep(4000);
		Reporter.log("running TC5", true);
	}//marked as fail
}
	