package KiteTest;

import org.testng.annotations.BeforeClass;

import KiteAppPOM.KiteLoginPage;
import newBaseKite.BaseNew;
  
public class ValidateKiteUserIDUsingProperty extends BaseNew
{
	  KiteLoginPage home;
      KiteLoginPage login;
      KiteLoginPage pin;
      String TCID="555";
      
      @BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		login =new KiteLoginPage(driver);
		pin =new KiteLoginPage(driver);
		
		home =new KiteHomepage(driver); 
		
	}
}
