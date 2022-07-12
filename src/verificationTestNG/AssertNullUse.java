package verificationTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullUse 
{
 @Test
 public void myMethod1()
 {
	 String a=null;
	 String b="abc";
	 
	 Assert.assertNotNull(b, "value is null TC is failed");
     Reporter.log("Value is not null testcase is passed", true);
  }
}
