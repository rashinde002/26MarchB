package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BNavigateMethod 
{
 public static void main(String args[]) throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("https://www.flipkart.com/");
 	Thread.sleep(2000);
    driver.navigate().to("https://www.amazon.in/");

 	Thread.sleep(2000);

    driver.navigate().back();
 	Thread.sleep(2000);

 	driver.navigate().forward();
 	Thread.sleep(2000);

 	driver.navigate().refresh();
 	Thread.sleep(2000);
 	
 

 	driver.quit();
    
}
}
