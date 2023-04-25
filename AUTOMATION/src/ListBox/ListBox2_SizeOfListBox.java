
package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_SizeOfListBox {
	
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
			 
			 //step 3:
			 //return type of getOption is ListofWebElement
			 
			 List<WebElement> allOptions = s.getOptions();
			 System.out.println("Lisy Box size:" +allOptions.size());//31
			 
			 for(WebElement opt : allOptions) {
				 System.out.println(opt.getText());
				 
			 }
			 
			 Thread.sleep(2000);
			 driver.quit();
			 
	}

}
