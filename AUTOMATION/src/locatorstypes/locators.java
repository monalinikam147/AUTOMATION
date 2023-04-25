package locatorstypes;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locators {
	
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
		 
		// 1.tagname
		 driver.findElement(By.tagName("input")).sendKeys("monali@gmail.com");
		 
		 Thread.sleep(1000);
		 
		//2.id
         driver.findElement(By.id("12345")).sendKeys("1234567");
         
         Thread.sleep(2000);
		 
		 
		 //3.name
		 driver.findElement(By.name("abc")).sendKeys("monali@1234.com");
		 Thread.sleep(1000);
		 
		 
		 //4. classname
		 driver.findElement(By.className("class123")).sendKeys("8380896004");
		 Thread.sleep(2000);
		 
		 //5. Linktext
		// driver.findElement(By.linkText("Link1")).click();
		 //Thread.sleep(2000);
		 
		 //6.partialLinktext
		 driver.findElement(By.partialLinkText("Li")).click(); 
		 Thread.sleep(2000);
		 
		 
		 
		 driver.close();
		
	}

}
