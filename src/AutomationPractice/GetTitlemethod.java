package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlemethod
{
  public static void main(String args[])
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      
      String URL= driver.getCurrentUrl();  
      System.out.println(URL);
      driver.close();
  }
}
