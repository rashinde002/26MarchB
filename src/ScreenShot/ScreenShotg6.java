package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotg6
{
  public static void main(String args[]) throws IOException, InterruptedException
  {
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
  
	  WebDriver driver= new ChromeDriver();
	  
	  driver.get("https://my.shaadi.com/my-shaadi/my-profile");
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	File  src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  
	System.out.println(src);
	
	File dest= new File("C:\\Users\\admin\\Downloads\\Screenshotg6.png");
  
	FileHandler.copy(src, dest);
	
	driver.close();
  }
}
