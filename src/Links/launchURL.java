package Links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchURL {

	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();	
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");
	
	//driver.close();
		}

}
