package waitTime;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {   //FLUENT WAIT

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herouapp.com/dynamic_loading/1");
	driver.findElement(By.cssSelector("[id='start']button")).click();
	
	Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
			.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	
	WebElement foo =wait.until(new Function<WebDriver, WebElement>()
			{
		public WebElement apply(WebDriver driver)
		{
		return driver.findElement(By.cssSelector("[id='finish'] h4"));
		}
			});
	
	System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed());
	driver.close();
	}
	
}