package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/select-menu");

	Thread.sleep(1000);
	
	WebElement multiselectElement=driver.findElement(By.name("cars"));
	
	Select s= new Select(multiselectElement);
	
	System.out.println("Multi Select status is " + s.isMultiple());
	
	s.selectByVisibleText("Volvo");
	
	s.selectByIndex(2);
 
	s.selectByValue("Audi");
	}

}
