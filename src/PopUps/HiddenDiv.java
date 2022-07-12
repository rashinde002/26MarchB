package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiv 
{
 public static void main(String args[]) throws InterruptedException
 {
 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.flipkart.com/");
 
 Thread.sleep(1000);
 driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
 }
}
