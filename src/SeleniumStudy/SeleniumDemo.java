package SeleniumStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo 
{
   public static void main(String args[])
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
     
	   WebDriver driver=new ChromeDriver();//browser initialisation
	   
	   driver.get("https://www.facebook.com/");
	   
	   driver.findElement(By.id("email")).sendKeys("rohit@gmail.com");
	   
	   driver.findElement(By.id("pass")).sendKeys("kslkcfnflkfc");
       
	  driver.findElement(By.name("login")).click();
    
	  System.out.println(driver.getCurrentUrl()); 
	  
	   //driver.wait(5);
	   driver.close();
   
   }
}
