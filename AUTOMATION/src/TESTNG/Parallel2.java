package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parallel2 {
	
	@Test
	
	public void TC2() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		 WebDriver driver = new ChromeDriver(option);  //upcasting
		
		 driver.manage().window().maximize();
		 
		 //1. get() to open url
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
	}

}
