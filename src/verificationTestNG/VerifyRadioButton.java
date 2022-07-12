package verificationTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyRadioButton
{
	@Test
 public void myMethod()
 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://vctcpune.com/selenium/practice.html");
 
   /* if(radio1.isSelected())
    {
    	System.out.println("TC is passed");
    }
    
    else
    {
    	System.out.println("TC is failed");
    }*/
  
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	JavascriptExecutor j= (JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(80, 700)");

	 WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	   radio1.click();
    Assert.assertTrue(radio1.isSelected(), "Radio1 is not selected TC is failed");
    
   // driver.quit();
 }
}

/*  assertEquals()
  assertNorEquals()
  
  assertTrue()
  assertFalse()
  
  assertNull()
  assertNotNull()
  
  fail()
*/