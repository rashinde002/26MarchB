package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException
	{
  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");	
   WebDriver driver= new ChromeDriver();
   
   driver.manage().window().maximize();
   driver.get("https://www.google.com/");
	Thread.sleep(2000);

	driver.findElement(By.name("q")).sendKeys("honda");
	Thread.sleep(2000);
 
	
	}

}
