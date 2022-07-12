package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass1
{
  @Test	
  public void KiteLogin()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  
	
  
  }
}
