package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fbListBox {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(1000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Actions act= new Actions(driver);
	Thread.sleep(1000);
	act.click(month).perform();
	
	Thread.sleep(1000);
	for(int i=0; i<=4; i++)
    act.sendKeys(Keys.ARROW_DOWN).click().perform();
	}

}
