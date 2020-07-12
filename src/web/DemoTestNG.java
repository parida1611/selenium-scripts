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

public class DemoTestNG {

	// Pre-execution conditions
	
	@BeforeSuite //priority = 1
	public void runBeforeScuite() {
		System.out.println("I am before suite");
	}
	
	@BeforeClass //priority =3
	public void runBeforeClass() {
		System.out.println("I am beforeclass. New class execution started.");
	}
	
	@BeforeMethod //priority =4
	public void runBeforeMethod() {
		System.out.println("I am beforeMetho. Taking new method");
	}
	
	@BeforeTest //priority =2
	public void runBeforeTest() {
		System.out.println("I am before test. Taking new tests.");
	}
	
	
	
	// Executions
	@Test (priority=1, description = "Demo printing testcase")
	public void printMe() {
		System.out.println("First TestNG Line.");
		Assert.assertEquals(12, 12);
	}
	
	@Test(priority=2, description = "second test case in excel", dependsOnMethods = "printMe")
	public void checkLoginFunctionality() {
		System.out.println("Second Testcase");
		Assert.assertTrue(54<29);
	}
	
	@Test(priority=3, description = "third test case in excel", enabled = true)
	public void checkdatabaseFunctionality() {
		System.out.println("Third Testcase");
	}
	
	
	// Post-execution conditions
	
	
	@AfterMethod
	public void runAfterMethod() {
		System.out.println("I run after each method");
	}
	
	@AfterClass
	public void runafterClass() {
		System.out.println("I am after class");
	}
	
	@AfterTest
	public void runafterTest() {
		System.out.println("I am after test");
	}
	
	@AfterSuite
	public void runafterScuite() {
		System.out.println("I am after suite");
	}
}
