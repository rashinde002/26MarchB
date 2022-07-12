package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp
{	
	public static void captureScreenShot(WebDriver driver, String TCID) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest= new File("C:\\Users\\admin\\Desktop\\Screenshot");
	    FileHandler.copy(src, dest);
	}
	public static String getDataFromPropFile(String key) throws IOException 
	{
		Properties p=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\26March_Automation\\src\\KiteUtility\\PropertiesFile");
		p.load(fis);
		String value= p.getProperty(key);
		return value;	
	}
	
	
	
	
}
