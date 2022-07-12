package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testframe 
{
 public static void main(String args[]) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
    
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://skpatro.github.io/demo/iframes/");
	 driver.manage().window().maximize();
 	String text= driver.findElement(By.linkText("Pavilion")).getText();
	System.out.println(text);
	
	String text1= driver.findElement(By.linkText("Blogger")).getText();
	System.out.println(text1);
    
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	
	String text3= driver.findElement(By.id("frametext")).getText();
	System.out.println(text3);
	
	String title= driver.switchTo().defaultContent().getTitle();
	System.out.println("Now focus should be on main page " + title);
	
	driver.close();
 }
}
