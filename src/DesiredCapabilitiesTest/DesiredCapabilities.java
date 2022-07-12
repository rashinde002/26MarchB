package DesiredCapabilitiesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DesiredCapabilities 
{
  public static void main(String args[])
  {
	  DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	  
    System.setProperty("webdriver.ie.driver","C:\\Users\\admin\\Downloads\\IEDriverServer.exe");
    WebDriver driver= new InternetExplorerDriver();
    driver.manage().window().maximize();
    
    DesiredCapabilities capabilities= new DesiredCapabilities();
    capabilities
  }
}
