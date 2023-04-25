package TESTNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderAnnotations {

	
	@DataProvider(name="data-provider")
	public Object[][] dataProviderMethod()
	{
		return new Object[][] {{"Manual Testing"},{"Automation Testing"},{"SQL"},{"API"},{"Jekins"}};
		
	}
	
	@Test(dataProvider ="data-provider")
	public void TC1(String value)
	{
		System.out.println(value);
	}
}
