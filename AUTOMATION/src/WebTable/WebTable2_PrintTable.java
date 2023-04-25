package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable2_PrintTable {

	
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
		 
		 int rowSize = driver.findElements(By.xpath("//table[@class='12345']//tr")).size();
		 
		 for(int i=1; i<=rowSize; i++) {//row
			 int colSize=0;
			 if(i==1) {
				colSize = driver.findElements(By.xpath("//table[@class='12345']//tr["+ i +"]//th")).size();
			 }else {
			    colSize=driver.findElements(By.xpath("//table[@class='12345']//tr["+ i +"]//td")).size();
			 }
			 for(int j=0; j<=colSize; j++)
			 {//column
			String text = "";	
			if(i==1) {
				text=driver.findElement(By.xpath("//table[@class='12345']//tr["+i+"]//th["+j+"]")).getText();
				
			}else {
				driver.findElement(By.xpath("//table[@class='12345']//tr["+i+"]//th["+j+"]")).getText();
			}
			System.out.print(text+" ");
			 }
			 System.out.println();
		 }
		 
		 Thread.sleep(2000);
		 driver.quit();
	}
}
	