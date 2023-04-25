package locatorstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocaterHandleByXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		 WebDriver driver = new ChromeDriver(option);  //upcasting
		 
		 
          driver.manage().window().maximize();
		 
		 //1. get() to open url
		 driver.get("https://affiliate.flipkart.com/login");
		 
		 Thread.sleep(2000);
		 
		 
		 //Xpath by Attributes
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("monali@Anikam");
		 Thread.sleep(2000);
		 
		 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mona@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		//xpath by text()
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
        Thread.sleep(2000);
        
        //Xpath by contains
        driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
        Thread.sleep(2000);
        }

}
