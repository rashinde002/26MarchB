package ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotg5 
{
 public static void main(String args[]) throws InterruptedException
 {
System.setProperty("Webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
			 
	  WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.flipkart.com/");
 
     driver.manage().window().maximize();
    
     Thread.sleep(1000);
   
    
    
 }
}
