package SeleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slenium1 
  {
  public static void main(String args[]) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
      
	  WebDriver driver=new ChromeDriver();
   
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Rohit");
	  
	  Thread.sleep(10);
	  
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("gjvdkd");
	  
      driver.findElement(By.xpath("//input[@name='proceed']")).click();
      
      System.out.println(driver.getCurrentUrl()); 
  
      driver.close();
  }
  }
