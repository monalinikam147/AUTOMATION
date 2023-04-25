package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_signIn {
	
	
	//declaration
	@FindBy(xpath="//a[contains(text(),'Sign in')]") private WebElement signIn;
	
	//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"))convert initElement into this statement
	
	
	//initialization
	public Github_signIn(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
		
	}
	
	//usage
	
	public void clickGithubSignInBtn()
	{
		signIn.click();
	}

}
