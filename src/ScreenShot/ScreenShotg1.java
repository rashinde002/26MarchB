package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotg1 
{
 public static void main(String args[]) throws InterruptedException, IOException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
     
	 Thread.sleep(1000);
	File Source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	System.out.println(Source);
	File dest= new File("C:\\Users\\admin\\Desktop\\Screenshot.png");
	FileHandler.copy(Source, dest);

	//driver.close();
 }
}
