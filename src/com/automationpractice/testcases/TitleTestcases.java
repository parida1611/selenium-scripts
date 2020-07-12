package com.automationpractice.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automationpractice.pages.CommonPage;
import com.automationpractice.pages.CreateAccountPage;
import com.google.common.io.Files;

public class TitleTestcases {

	WebDriver driver;
	TakesScreenshot srcShot;
	
	@BeforeClass
	public void launchBrowser() {
		//Before
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		srcShot = (TakesScreenshot)driver;	
		driver.manage().window().maximize();
	}
	
	@Test
	public void validateTitle() {	
		//Test
		try {
			
			CommonPage commonPage = new CommonPage(driver);
			
			commonPage.launchApplication("http://automationpractice.com");
			
			
			boolean isTitleMatch = commonPage.validatePageTitle("store");

			
			Assert.assertTrue(isTitleMatch);		
			
		}catch(Exception e){		
			e.printStackTrace();
		}		
	}
	
	@AfterClass
	public void closeBrowser() {
		//After
		driver.quit();
	}
}
