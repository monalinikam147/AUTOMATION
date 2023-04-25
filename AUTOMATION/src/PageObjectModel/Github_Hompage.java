package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_Hompage {
	
	
	//Decleration
	@FindBy(xpath="(//summary[@class='Header-link'])[2]") private WebElement signOutBtn;
	
    //initialization
	public Github_Hompage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void clickGithubHompageSignOutBtn() {
		signOutBtn.click();
	}

	
}
