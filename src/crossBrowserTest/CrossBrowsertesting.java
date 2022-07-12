package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsertesting 
{
   @Parameters("BrowserName")
   @Test
   public void myMethod(String name)
   {
	   WebDriver driver = null;
	   if(name.equals("firefox"))
	   {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver.exe");
		 driver= new FirefoxDriver();	
	   }
	   
	   else if(name.equals("chrome"))
	   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	   driver= new ChromeDriver();	
			
	   }
	   
	   driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
   }

}
