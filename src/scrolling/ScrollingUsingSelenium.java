package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingSelenium {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://vctcpune.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
	JavascriptExecutor j= (JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(90, 800)");
	}

}
