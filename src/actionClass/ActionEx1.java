package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEx1 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver(); //Open URL in the browser
	driver.manage().window().maximize(); // maximize the browser
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.findElement(By.linkText("Selenium"));
	Thread.sleep(1000);
	
	//How to click using Action class
	//Create object of Action class and pass driver object
	
	Actions act= new Actions(driver);
	act.click().contextClick().build().perform();
	
	
	}

}
