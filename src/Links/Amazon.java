package Links;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
  public static void main(String args[])
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
	  
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize(); 
	  driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  List<WebElement> links= driver.findElements(By.tagName("a"));
	  System.out.println(links.size());
	  
	  driver.close();
  }
}
