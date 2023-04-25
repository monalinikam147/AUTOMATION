package DDF_POM_TestNG_BaseClass_Uitility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	//1.parameterization
	
	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("E:\\monali\\Exceel1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("GitHub");
	String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	return value;
	}
	
	//2.ScreenShotcapture

	public static void captureScreenShot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//System.out.println(src);
	    File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\AUTOMATION\\screenshots\\GitHub_"+TCID+".png");
	    FileHandler.copy(src, dest);
	}
	
	// 3.to read data from .properties file
	
	    public static String getPropertyFileData(String key) throws IOException
	    {
	    	Properties obj = new Properties();
	    	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\GitHub.properites");
	    	obj.load(file);
	    	String value = obj.getProperty(key);
			return value;
	    }
}
