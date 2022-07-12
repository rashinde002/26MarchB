package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotg2 
{
 public static void main(String [] args) throws InterruptedException, IOException
{
   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");	 
   
   WebDriver driver= new ChromeDriver();
   
   driver.get("https://mail.google.com/mail/u/0/#inbox/FMfcgzGpGBFGgrdMQKZdMTbfKskcTmxH");

   Thread.sleep(1000);
   
 File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
 File dest= new File("C:\\Users\\admin\\Desktop\\Screenshotg2.png");

 FileHandler.copy(src, dest);
 
 driver.close();
}
}
