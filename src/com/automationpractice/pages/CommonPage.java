package com.automationpractice.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class CommonPage {
	
	
	WebDriver driver;

	public CommonPage(WebDriver driver){
		this.driver = driver;
	}
	
	
	public void launchApplication(String url) {
		driver.get(url);	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validatePageTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
//		return expectedTitle.equalsIgnoreCase(actualTitle);
		System.out.println(actualTitle);
		
		return actualTitle.contains(expectedTitle);
		
	}
	
}
