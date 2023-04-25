package TESTNG;

import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class Log4jExample {
	
	private static Logger logger = Logger.getLogger(Log4jExample.class);
	
	
	@Test
	public void TC1()
	{
		PropertyConfigurable("log4j.properties");
		
		System.setProperty("Webdriver.chrome.driver", "E:\\New folder\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		 //handling of notification
		option.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(option);  //upcasting
		 
		 logger.debug("Starting test");
		 driver.get("https://www.google.com/");
		 logger.info("Opened Google Website");
		 String title = driver.getTitle();
		 logger.debug("Page title:" +title);
		 if(title.equals("Google")) {
			 logger.info("Title is correct");
		 }else{
			 logger.error("Title is incorrect");
		 }
		 
		 driver.quit();
		 
		 logger.debug("Test Complete");
		 
		
	}

}
