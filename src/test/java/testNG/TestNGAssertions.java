package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {
	
	// Assertion are used to validated the expected result againt the acctul
	// TestNG provide two type of assertion 
	// 1. hard assertion if expected result is not equal to acctul execution will stop
	// 2. soft assertion if expected result is not equal to acutl exectution will will continue
	// and the end of the execution test will be failed
	
	@Test (enabled = false)
	public void hardAssertion() {
		int actualValue = 10;
		int expectedValue =10;
		
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("this line will execute if the assertion pass");
	}
	
    @Test 
    public void softAssertion() {
    	
    // TestNG provide a class called softassert and we create the object the softassert
    	//then we use method provided by this class 
    	// once all assertion are written we have call assertAll()method
    	
    	int a = 10;
    	int b = 15;
    	
    	SoftAssert softAssert = new SoftAssert();
    	softAssert.assertEquals(a, b);
    	System.out.println("This line of code will be executed regardless of passing or failing");
    	softAssert.assertTrue(false);
    	System.out.println("This is after second Assertion ");
    	softAssert.assertTrue(true);
    	System.out.println("This is after 3rd assertion ");
    	
    	softAssert.assertAll();
    	
    	
    	
    	
    	
    	
    }
}
