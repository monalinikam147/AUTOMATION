package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class geturl {
	public static void main(String[] args) throws InterruptedException {
		
		
		//set the browser configuration
				System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
				
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				
				 WebDriver driver = new ChromeDriver(option);  //upcasting
				 
				 
		          driver.manage().window().maximize();
				 
				 //1. get() to open url
				 driver.get("file:///C:/mona/samplewebpage.html");
				 
				 Thread.sleep(2000);
				 
	}

}
