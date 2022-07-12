package waitTime;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herouapp.com/dynamic_loading/1");
		
	Wait<WebDriver>	wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	
	
		
		
	}

}
