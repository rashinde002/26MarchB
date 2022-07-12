package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Scrg8
{
 public static void main(String args[]) throws InterruptedException, IOException  
 {
	 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
 
	 WebDriver driver=new  ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://web.whatsapp.com/");
 
	 Thread.sleep(1000);
	 
	 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
	 File dest= new File("C:\\Users\\admin\\Desktop\\ScreenshotWhat.png");
 
	 FileHandler.copy(src, dest);
  
	 driver.close();
 
 }
}
