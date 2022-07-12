package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice
{
  public static void main(String args[]) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

	Thread.sleep(2000);

	driver.findElement(By.id("promptBox")).click();
		
	Alert prompttext= driver.switchTo().alert();
			
	System.out.println(prompttext.getText());
	prompttext.sendKeys("Rohit");
	prompttext.accept();
	
	Thread.sleep(1000);
    System.out.println(driver.findElement(By.id("output")).getText());
    
    driver.quit();
  }
}
