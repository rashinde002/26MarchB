package Window_Handles;

import java.util.Iterator;
import java.util.Set;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling 
{
 public static void main (String args[]) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver.exe");
 
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://skpatro.github.io/demo/links/");
	 
	 Thread.sleep(1000);
	 driver.findElement(By.name("NewTab")).click();
	 
	 String mainpageID= driver.getWindowHandle();
	 System.out.println("The main page ID is " +mainpageID);
	 
	 System.out.println("====================================");
 
	 driver.findElement(By.name("NewWindow")).click();
	 
	 Thread.sleep(1000);
	 
	Set<String> allpageIDs = driver.getWindowHandles();

	Iterator<String> it = allpageIDs.iterator();
     
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
 
    String mainpageID1= it.next();
 
 
 }
}