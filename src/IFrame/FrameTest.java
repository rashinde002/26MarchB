package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameTest
{
	@Test
  public void myMethod() throws InterruptedException
  {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");	  
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://ui.vision/demo/webtest/frames/");
  Thread.sleep(1000);
  
  driver.switchTo().frame(0);
  System.out.println("we are in frame 1");
  driver.findElement(By.name("mytext1")).sendKeys("Rohit");
  
  Thread.sleep(1000);
  //Switch to parent content
   driver.switchTo().parentFrame();
   
   //input text box2
   Thread.sleep(2000);
   driver.switchTo().frame(1);
   WebElement textbox2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
   textbox2.sendKeys("Shinde");
   
   //Switch to parent content
   driver.switchTo().defaultContent();
   
   //input textbox3
   Thread.sleep(2000);
   driver.switchTo().frame(2);
   WebElement textbox3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
   textbox3.sendKeys("Burhanpur");
   
   
   //Switch to parent frame
   driver.switchTo().defaultContent();
   
   //input textbox4
   Thread.sleep(2000);
   driver.switchTo().frame(3);
   
   WebElement textbox4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
   textbox4.sendKeys("450331");
  
  
  }
}
