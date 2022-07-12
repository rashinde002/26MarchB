package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrame1 
{
 public static void main(String args[]) throws InterruptedException
 {
	 System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
     WebDriver driver= new ChromeDriver();
    driver.get("https://skpatro.github.io/demo/iframes/");
    driver.manage().window().maximize();
 
    Thread.sleep(2000);
   String text= driver.findElement(By.linkText("Pavilion")).getText();
   System.out.println(text);
 
   driver.switchTo().frame(0);
  String text1= driver.findElement(By.id("Frame1")).getText();
  System.out.println(text1);
 
  driver.switchTo().frame(1);
  String text2= driver.findElement(By.id("Frame2")).getText();
  System.out.println(text2);
 
 
 }
}
