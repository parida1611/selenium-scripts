package com.automationpractice.testcases;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationpractice.pages.AccountPage;
import com.automationpractice.pages.CommonPage;
import com.automationpractice.pages.LoginPage;

public class LoginPageTestCases {
	
	WebDriver driver;
	TakesScreenshot srcShot;
	
	CommonPage commonPage;
	LoginPage loginPage;
	
	String baseUrl = "http://automationpractice.com/";
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		srcShot = (TakesScreenshot)driver;	
		driver.manage().window().maximize();
		
		commonPage = new CommonPage(driver);
		loginPage = new LoginPage(driver);
	}
	
	@Test(priority=0, enabled = false)
	public void verifyCreateAnAccountFunctionality() {
		
		commonPage.launchApplication(baseUrl);		// 1
		loginPage.goToSignInPage();					//2 
		loginPage.createAnAccount("wee@gmail.com");		// 3
		
	}	
	
	@Test(priority=1)
	public void verifyLoginFunctionality() {
		
		AccountPage accountPage = new AccountPage(driver);
	
		commonPage.launchApplication(baseUrl);   // 1	
		loginPage.goToSignInPage();											// 2
		loginPage.doLogin("automation.tester@gmail.com", "12345678");       // 3
		
		WebElement myaccountHeader = driver.findElement(accountPage.pageHeader);
		Assert.assertTrue(myaccountHeader.isDisplayed());	     					// Validation step
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
