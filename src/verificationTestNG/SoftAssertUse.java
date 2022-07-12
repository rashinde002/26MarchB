package verificationTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse 
{
	@Test
  public void myMethod()
  {
	  String a="abc";
	  String b="abc";
  
    //to use soft Assert you'll need to create object of SoftAssert class
	  
	  SoftAssert soft=new SoftAssert();
      soft.assertNotEquals(a,b, "Both are equal TC is failed");
      soft.assertNull(b, "Values are not null TC is failed");
  
      soft.assertAll();
  }
	@Test
	public void testing()
	{
		boolean a=true;
		boolean b=false;
	
	SoftAssert s= new SoftAssert();
	
	s.assertTrue(b, "Value is false TC is failed");
	s.assertFalse(a,"Value is true TC is failed");
	
	s.assertAll();
	}
	
}
