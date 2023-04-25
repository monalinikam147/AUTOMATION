package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation {

	@BeforeClass
	public void openBrowser()
	{
		//open browser
	}
	@BeforeMethod()
	
	public void login()
	{
		//login code	
	}
	
	@Test
	public void verifyUN()
	{
		//verify user name code
	}
	@Test
	public void verifyPWD()
	{
		//verify password code
	}
	@AfterMethod()
	public void logout()
	{
		//logout
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//close browser
	}
}

