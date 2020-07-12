package web;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTestNG {
	
	/// Preconditions = Before Execution
	//Before
//	@BeforeClass   = exceuted before each class
//	@BeforeMethod   = executed before each method
//	@BeforeTest  = executed before each test
	
	
	
	
	
	
	@BeforeMethod						// = before suite
	public void runBefore() {
		System.out.println("I run before suites");
	}
	
	
	/// @Test = Executed as part of testcases
	
	@Test(priority = 1, description = "This testcases validates the actual title with the expected title")
	public void validateTitle() {
		System.out.println("I am a testNG method validateTitle");
		Assert.assertEquals("Automable Practice", "Automation Practice");
	}
	
	@Test(priority = 2, description = "This method validates the presence of UI Elements on web page.", dependsOnMethods ="validateTitle")
	public void validateHopePageUI() {
		System.out.println("I am a testNG method validateHopePageUI");
	}
	
	@Test(priority = 3)
	public void validateSignInButton() {
		System.out.println("I am a testNG method validateSignInButton");
		
	}
	

	//// Post execution or After Execution
	
	// After
	@AfterMethod
	public void runAfter() {
		System.out.println("I run after suites");
	}
}
