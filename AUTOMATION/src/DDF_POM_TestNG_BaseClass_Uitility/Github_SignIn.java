package DDF_POM_TestNG_BaseClass_Uitility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_SignIn {
	
	
	//Declaration
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement SI;
	
	public Github_SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
     public void clickGithubSignInButton() throws InterruptedException {
    	 SI.click();
    	 
    	 Thread.sleep(2000);
     }
}
