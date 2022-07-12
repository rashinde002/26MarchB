package AutomationPractice;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_Getsize {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");	  
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.flipkart.com/");
	      
		  Dimension d1= driver.manage().window().getSize();
		  
		  System.out.println(d1);
	
	}

}
