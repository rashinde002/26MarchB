package waitTime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	driver.get("https://vctcpune.com/");	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofMillis(1000));
	WebElement courses = driver.findElement(By.linkText("Courses"));
	wait.until(ExpectedConditions.visibilityOf(courses));
	courses.click();
	//driver.close();
	}

}
