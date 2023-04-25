package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListBox4_getFirstSelectedOption {

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
		 
		 //setp 3:
		 
		 s.selectByVisibleText("20");
		 
		 //return type of getFirstSelectedOption  is WebElement
		  System.out.println(s.getFirstSelectedOption().getText());
		  
		  
		  //getAllSelectedOptions->return type is List<WebElement>
		 List<WebElement> allOptions = s.getAllSelectedOptions();
		 
		 for(WebElement opt:allOptions)
			 System.out.println(opt.getText());
		 
		 Thread.sleep(2000);
		 driver.quit();
}
	
}
