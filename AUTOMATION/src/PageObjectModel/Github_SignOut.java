package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_SignOut {

	//Decleration
	@FindBy(xpath="//button[contains(text(),'Sign out')]") private WebElement signOut;
	
	
	//Initialization
	public Github_SignOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	//usage
	public void clicGithubHompageSignOutBtn()
	{
		signOut.click();
	}
	

}
