package AutomationPractice;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize 
{
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.flipkart.com/");
      Thread.sleep(2000);
      
      Dimension d= new Dimension(600, 600);
      driver.manage().window().setSize(d);
      
      driver.close();
      
	}
}