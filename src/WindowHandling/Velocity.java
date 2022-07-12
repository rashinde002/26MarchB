package WindowHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Velocity {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(5000);
	
	List<WebElement> links = driver.findElements(By.tagName("img"));
	System.out.println(links.size());
	
	for(WebElement l:links)
	{
		System.out.println(l.getText());
	}
	}

}
