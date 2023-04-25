package automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {
	
	public static void main(String[] args) throws InterruptedException {
		
        String expurl =  "https://www.selenium.dev/downloads/";
		
		//set the browser  configuration
		System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();  //upcasting
		 
		 //4. maximize()
		 driver.manage().window().maximize();
		 
		 //1. get() to open url
		 driver.get("https://www.selenium.dev/downloads/");
		 
		 Thread.sleep(2000);
		 
		 
		 Dimension d = new Dimension(500,800);// width=500 nd height=800
		 driver.manage().window().setSize(d);
		 
		 
		 Thread.sleep(2000);
		 driver.quit();
		 
		 
		
	}

}
