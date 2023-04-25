package DDF_POM_TestNG_BaseClass_Uitility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_Home {
	@FindBy(xpath="(//summary[@class='Header-link'])[2]") private WebElement logOutBtn;
    @FindBy(xpath="//strong[contains(text(),'monalinikam147')]") private WebElement UserName;
    
    public Github_Home(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickGithubHomeLogOutBtn() throws InterruptedException {
    	logOutBtn.click();
    	Thread.sleep(4000);
    }
    
    public String verifyGitHubHomePageUN()
    {
     String actResult = UserName.getText();
		return actResult;
    }
}
