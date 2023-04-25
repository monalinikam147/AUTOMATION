package locatorstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSecelector {
	
	public static void main(String[] args) throws InterruptedException {
		
		//set the browser configuration
				System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
				
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				
				 WebDriver driver = new ChromeDriver(option);  //upcasting
				 
				 
		          driver.manage().window().maximize();
				 
				 //1. get() to open url
				 driver.get("https://www.facebook.com/");
				 
				 Thread.sleep(2000);
				 
				 driver.findElement(By.cssSelector(" input[type='text']")).sendKeys("mona@1234.com");
				 Thread.sleep(1000);
				 
				 
				 driver.findElement(By.cssSelector(" input[placeholder='Password']")).sendKeys("1234567");
				 Thread.sleep(1000);
				 
				 driver.findElement(By.cssSelector("button[value='1']")).click();
				 Thread.sleep(1000);
				 
				 driver.quit();
	}
}
