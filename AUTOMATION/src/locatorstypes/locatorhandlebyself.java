package locatorstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locatorhandlebyself {

	
	public static void main(String[] args) throws InterruptedException {
		
		//set the browser configuration
				//System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
				
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				
				 WebDriver driver = new ChromeDriver(option);  //upcasting
				 
				 
		          driver.manage().window().maximize();
				 
				 //1. get() to open url
				 driver.get("https://affiliate.flipkart.com/login");
				 
				 Thread.sleep(2000);
				 
				 // cssSelector by flipkart.com 1.email
				driver.findElement(By.cssSelector("input[type='email']")).sendKeys("monali nikam");
				 Thread.sleep(2000);
				 
				 //2.cssSelector by flipkart.com 2.password field
				 driver.findElement(By.cssSelector(" input[type='password']")).sendKeys("monanikam@1234");
				 Thread.sleep(2000);
				 
				 
				 //cssSelector by Flipkart.com 3.sign in option
				 driver.findElement(By.cssSelector(" input[type='submit']")).click();
				 Thread.sleep(1000);
				 
				 
				 //LinkText
				 driver.findElement(By.linkText("Forgot password?")).click();
				 Thread.sleep(2000);
				 
			
				
				 
				
				 
				 driver.close();
	}
}
