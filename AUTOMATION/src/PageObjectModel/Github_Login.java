package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_Login {
	
	
	//Deceleration]
	@FindBy(xpath="//input[@id='login_field']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(css="input[type='submit']") private WebElement loginBtn;
	
	
	//Initialization
	public Github_Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//usage
	public void setGithubLoginUN()
	{
		UN.sendKeys("monalinikam147@gmail.com");
	}
	
	public void setGithubPWD()
	{
		PWD.sendKeys("mona2626452");
	}
	
	public void clickGithubLoginBtn()
	{
		loginBtn.click();
	}
	
	


}
