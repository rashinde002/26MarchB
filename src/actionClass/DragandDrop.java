package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop {
    @Test 
	public void draganddrop()
	{			
   System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	//Element that we need to drag
	WebElement source = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	
	//Element that we need to drop
	WebElement target = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	
	//Creating Action class object for drag and drop
	Actions act=new Actions(driver);
	
	act.dragAndDrop(source, target).build().perform();
	}

}

