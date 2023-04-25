package locatorstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class flipkartxpathbylocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		
	       System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");

	       ChromeOptions option = new ChromeOptions();
	       option.addArguments("--remote-allow-origins=*");
	       
	       
	       WebDriver driver = new ChromeDriver(option);
	       
	       driver.manage().window().maximize();
	       
	       driver.get("https://affiliate.flipkart.com/login");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.cssSelector("input[type='email']")).sendKeys("monalipawar9495@gmail.com");
	       Thread.sleep(2000);
	       
	       
	       driver.findElement(By.cssSelector(" input[type='password']")).sendKeys("mona@8888");
	       Thread.sleep(2000);
	       
	       
	       driver.findElement(By.cssSelector("input[type='submit']")).click();
	       Thread.sleep(2000);
	       
	       
	      // driver.findElement(By.linkText("Forgot password?")).click();
	       //Thread.sleep(2000);
	       
	       driver.findElement(By.partialLinkText("Forgot")).click();
	       Thread.sleep(2000);
	       
	       
	       //driver.close();
	       
	       driver.quit();
	       
	       
	       
	       
	       
	}

}
