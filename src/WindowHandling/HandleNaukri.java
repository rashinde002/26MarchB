package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNaukri {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");	
   //To open the browser
	WebDriver driver= new ChromeDriver();
	//To maximize the browser
	driver.manage().window().maximize();
	//To open naukri website with multiple windows
	driver.get("https://www.naukri.com/");
	//It will return the parent window name as a String
	String MainWindow = driver.getWindowHandle();
	//It will return the no. of windows open by WebDriver and will return Set of Strings
	  Set<String> set = driver.getWindowHandles();
	//Using Iterator to iterate within windows
	  Iterator<String> itr = set.iterator();
	  while(itr.hasNext())
	  {
		  String ChildWindow = itr.next();
	  //Compare whether the main windows is not equal to child window. If not equal, we will close 
		  if(!MainWindow.equals(ChildWindow)){
			  driver.switchTo().window(ChildWindow);
			  System.out.println(driver.switchTo().window(ChildWindow).getTitle());
			  driver.close();
			  }
	  
	  }
	}

}
