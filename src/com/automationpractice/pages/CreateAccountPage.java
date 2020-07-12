package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {

	WebDriver driver;
	WebDriverWait wait;
	
	 @FindBy(xpath="//a[@class='login']")
	 WebElement signInLink;
	 @FindBy(xpath="//input[@id='email_create']")
	 WebElement emailIdField;
	 @FindBy(xpath="//button[@id='SubmitCreate']")
	 WebElement createAccButton;
	
//	By loginLink = By.xpath("//a[@class='login']");
//	By emailField = By.xpath("//input[@id='email_create']");
//	By bttn = By.xpath("//button[@id='SubmitCreate']");
	
//	WebElement signInLink = driver.findElement(By.xpath("//a[@class='login']"));
//	WebElement emailIdField = driver.findElement(By.xpath("//input[@id='email_create']"));
//	WebElement createAccButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		AjaxElementLocatorFactory factoryWait = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	public void createAccount(String userName, String password) throws InterruptedException {
//		WebElement signInLink = driver.findElement(loginLink);
		signInLink.click();
		
		wait.until(ExpectedConditions.visibilityOf(emailIdField));
//		WebElement emailIdField = driver.findElement(emailField);
		emailIdField.sendKeys(userName);
//		WebElement createAccButton = driver.findElement(bttn);
		createAccButton.click();
		
		Thread.sleep(2000);
		
	}
	
}
