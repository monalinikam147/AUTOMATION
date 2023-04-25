package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable1_getRowSize_getCellSize {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		 //handling of notification
		option.addArguments("--disable-notifications");
		 WebDriver driver = new ChromeDriver(option);  //upcasting
		
		 driver.manage().window().maximize();
		 
		 driver.get("file:///E:/monali/WebTable.html");
		 Thread.sleep(2000);
		 
		 List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='12345']//tr"));
		 int rowSize = allRows.size();
		 System.out.println(rowSize);
		 
		 int colSize = driver.findElements(By.xpath("//table[@class='12345']//tr[1]//th")).size();
		 System.out.println(colSize);
		 
		 driver.quit();
	}

}
