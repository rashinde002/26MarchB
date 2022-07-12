package SeleniumStudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seln1 {

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
    
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://vctcpune.com/selenium/practice.html");
      
      driver.findElement(By.xpath("//*[@id=\"topheader\"]/section/div/div/a[1]")).click();
     // driver.close();
	}

}
