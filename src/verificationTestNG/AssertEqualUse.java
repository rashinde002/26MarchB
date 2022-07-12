package verificationTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualUse 
{
    @Test 
	public void myMethod()
	{
		String a="Punes";
		String b="Pune";
		
		Assert.assertNotEquals(a, b, "if a and b values are matching TC is failed");
		
		Reporter.log("a and b values are not matching TC passed", true);
		
	}
}
