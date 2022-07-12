package Window_Handles;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrac
{
		public static void main(String[] args) throws InterruptedException 
		{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.manage().deleteAllCookies();
		 
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Thread.sleep(2000);
		
		java.util.Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

	   String parentWindowId = it.next();
	   
	   System.out.println("Parentwindow id is " + parentWindowId );
		
	   String childWindowId = it.next();
	 
	   System.out.println("childWindowId is "+ childWindowId);
	   
	   driver.switchTo().window(childWindowId);
	   
	   Thread.sleep(2000);
		
		System.out.println("childWindowId Title " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("parentWindowId Title "+ driver.getTitle());
		
		driver.close();
		
		}
	}
