package KiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	Thread.sleep(1000);
	
	WebElement Userid = driver.findElement(By.id("userid"));
    WebElement PWD = driver.findElement(By.id("password"));
	WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	Userid.sendKeys("ELR321");
	PWD.sendKeys("Dhana1111");
	LoginButton.click();
	
	Thread.sleep(1000);
	
	WebElement PIN = driver.findElement(By.id("pin"));
	WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
	
	PIN.sendKeys("982278");
	ContinueButton.click();
	
	Thread.sleep(2000);
	
	WebElement UserName = driver.findElement(By.xpath("//span[@class='userid']"));
	
	String actualUserID = UserName.getText();
	String expectedUserID = "ELR321";
	
	if(actualUserID.equals(expectedUserID))
	{
		System.out.println("User ID is matching TC is Passed");
	}
	else
	{
		System.out.println("User ID is not matching TC is failed");
	}
	driver.close();
	}

}
