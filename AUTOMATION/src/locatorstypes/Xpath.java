package locatorstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		//set the browser configuration
		//System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		 WebDriver driver = new ChromeDriver(option);  //upcasting
		 
		 
          driver.manage().window().maximize();
		 
		 //1. get() to open url
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(2000);
		 
		 //xpath by attribute
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("monalia@123.com");
		 Thread.sleep(1000);
		 
		 
		 //xpath by attribute
		 driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("1234");
		 Thread.sleep(2000);
		 
		 
		 
		 //xpath by text
		 //driver.findElement(By.xpath("//button[text()='Log in']")).click();
		 //Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		 Thread.sleep(2000);
		 
		 //Xpath by contains
		 //driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		 //Thread.sleep(2000);
		 
		 //x path by index
		 //driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		 //Thread.sleep(2000);
		 
		 
		 
		 driver.close();
		 
		 driver.quit();
	}

}
