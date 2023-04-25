package automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {
	public static void main(String[] args) throws InterruptedException {
		//
        String expurl =  "https://www.selenium.dev/downloads/";
		
		//set the browser  configuration
		System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();  //upcasting
		 
		 //4. maximize()
		 driver.manage().window().maximize();
		 
		 //1. get() to open url
		 driver.get("https://www.selenium.dev/downloads/");
		 
		 
		 Thread.sleep(2000);
		 //8.setPosition
		 Point p = new Point(1200,2700);
		 
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
		 
		
	}

}
