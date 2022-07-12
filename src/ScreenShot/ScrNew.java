package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrNew {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(5000);
	
	File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	System.out.println(source);
	
	File Dest= new File("C:\\Users\\admin\\Desktop\\Screenshot.png");
	
	FileHandler.copy(source, Dest);
	driver.close();
	
	}

}
