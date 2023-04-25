package DDF_POM_TestNG_BaseClass_Uitility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitHubTest extends BaseClass { //inheritance
	
	Github_SignIn signIn;
	GitHub_Login logIn;
	Github_Home home;
	GitHub_SignOut signOut;
	
	
	@BeforeClass
	public void browserOpen() throws InterruptedException, IOException {
		openBrowser();
		signIn = new Github_SignIn(driver);
		logIn = new GitHub_Login(driver);
		home = new Github_Home(driver);
		signOut = new GitHub_SignOut(driver); 
		
		
	}
	@BeforeMethod
	public void logIn() throws Exception, IOException 
	{
		signIn.clickGithubSignInButton();
		logIn.setGitHubLoginUsername(Utility.getTestData(0, 0));
		logIn.setGitHubLoginPassword(Utility.getTestData(0, 1));
		logIn.clickGitHubLoginBtn();
		Thread.sleep(2000);
		
		home.clickGithubHomeLogOutBtn();
		
	}
	
	
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		String expResult = Utility.getTestData(0, 2);
		String actResult = home.verifyGitHubHomePageUN();
		
		Assert.assertEquals(actResult, expResult,"act ane exp is different");
	}
	
	
	//ITestResult - listener this class describe the result of a test
	
	@AfterMethod
	public void logOut(ITestResult result) throws IOException, InterruptedException
	{   
		//ITestResult result;
		if(result.getStatus()==ITestResult.FAILURE)
		{
			int TCID = 100;
			Utility.captureScreenShot(driver, TCID);
		}
		signOut.clickGitHubSignOutBtn();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
