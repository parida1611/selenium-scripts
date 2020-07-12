package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {

	WebDriver driver;
	
	public By pageHeader = By.xpath("//*[@id='center_column']/h1");
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
}
