package newBaseKite;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import KiteUtility.UtilityProp;

public class BaseNew
{
	protected WebDriver driver;
  
	public void openBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilityProp.getDataFromPropFile("URL"));
	Reporter.log("Launching Browser", true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	}
}
