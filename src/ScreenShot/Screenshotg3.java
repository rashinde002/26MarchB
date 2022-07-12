package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotg3 
{
 public static void main(String args[]) throws InterruptedException, IOException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.amazon.in/");
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(1000);
 
	 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
	 File dest= new File("C:\\Users\\admin\\Desktop\\Screenshotg3.png");
 
	 FileHandler.copy(src, dest);
	 
	 driver.close();
 }
}
