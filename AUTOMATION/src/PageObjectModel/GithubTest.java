package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GithubTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		 WebDriver driver = new ChromeDriver(option);  //upcasting
		
		 driver.manage().window().maximize();
		 
		 //1. get() to open url
		 driver.get("https://github.com/");
		 
		 Thread.sleep(2000);
		 
		 Github_signIn signIn = new Github_signIn(driver);
		 signIn.clickGithubSignInBtn();
		 Thread.sleep(4000);
		 
		 Github_Login login = new Github_Login(driver);
		 login.setGithubLoginUN();
		 login.setGithubPWD();
		 login.clickGithubLoginBtn();
		 Thread.sleep(4000);
		 
		 Github_Hompage home = new Github_Hompage(driver);
		 home.clickGithubHompageSignOutBtn();
		 Thread.sleep(4000);
		
		 
		 Github_SignOut signOut = new Github_SignOut(driver);
		 signOut.clicGithubHompageSignOutBtn();
		 
		 Thread.sleep(4000);
		 
		 driver.quit();
		 
	}

}
