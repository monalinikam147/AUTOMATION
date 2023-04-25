package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		String expurl =  "https://www.selenium.dev/downloads/";
		
		//set the browser  configuration
		System.setProperty("webdriver.chrome.driver", "E:\\monali\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();  //upcasting
		 
		 //4. maximize()
		 driver.manage().window().maximize();
		 
		 //1. get() to open url
		 driver.get("https://www.selenium.dev/downloads/");
		 
		 //5.minimize()
		//driver.manage().window().minimize();
		 
		 String acturl =driver.getCurrentUrl(); //"https://www.selenium.dev/downloads/"
		 System.out.println(acturl);
		 
		 if(acturl.equals(expurl))
		 {
			 System.out.println("pass");
		 }
		 
		 
		 //7.getTitle()
		  String  actTitle = driver.getTitle();
		  System.out.println(actTitle);
		  
		  
		//3.sleep delay  to browser thread execute each task thread is process which works on operating system
		Thread.sleep(2000);
		 
		 
		 //2.close 
		// driver.close();// only one windows can close
		 
		//3.quit() 
		 driver.quit();//we can close multiple windows close
		 
		 
		 
		
		
	}

}
