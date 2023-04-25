package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListBox1_Select {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
		 System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
			
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			 //handling of notification
			 option.addArguments("--disable-notifications");
			
			 WebDriver driver = new ChromeDriver(option);  //upcasting
			
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.facebook.com/");
			 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
			 Thread.sleep(4000);
			 
			 //step 1:-
			 //findElement-> WebElement
			 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			 
			 //setp 2:
			 //create object of select class
			 
			 Select s = new Select(day);
			 //s.selectByIndex(5);//6
			 
			 //s.selectByValue("30");
                s.selectByVisibleText("10");			 
			 Thread.sleep(2000);
			 driver.quit();

	}
}
