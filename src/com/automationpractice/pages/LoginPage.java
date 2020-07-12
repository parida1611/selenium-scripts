package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	// driver
	WebDriver driver;
	WebDriverWait wait;
	
	
	@FindBy(how = How.XPATH, using = "//a[@class='login']")    // driver.findElement(By.xpath("//a[@class='login']")) = WebElement
	public WebElement signInLink;
	
	@FindBy(id="email")
	public WebElement loginEmailAddressElement;
	
	@FindBy(xpath ="//*[@id='passwd']")
	public WebElement passwordFieldElement;
	
	
	@FindBy(xpath = "//*[@id='SubmitLogin']")
	public WebElement SignInButtonElement;
	
	@FindBy(xpath = "//input[@id='email_create']")
	public WebElement emailField;
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	public WebElement createAnAccountButton;
	
	//Locators
//	By signingLink = By.xpath("//a[@class='login']");
//	By loginEmailAddress = By.xpath("//*[@id='email']");
//	By passwordField = By.xpath("//*[@id='passwd']");
//	By signInButton = By.xpath("//*[@id='SubmitLogin']");
//	By emailAddress = By.xpath("//input[@id='email_create']");
//	By submitBtn = By.xpath("//button[@id='SubmitCreate']");
	
	
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	public void goToSignInPage() {
		
//		WebElement signInLink = driver.findElement(signingLink);
		
		signInLink.click();
		wait.until(ExpectedConditions.visibilityOf(loginEmailAddressElement));
	}
	
	public void createAnAccount(String emailValue) {
		
//		WebElement createAnAccountButton = driver.findElement(submitBtn);
		
		emailField.sendKeys(emailValue);
		createAnAccountButton.click();
	}
	
	public void doLogin(String emailId, String password) {
		
//		WebElement loginEmailAddressElement = driver.findElement(loginEmailAddress);
//		WebElement passwordFieldElement = driver.findElement(passwordField);
//		WebElement SignInButtonElement = driver.findElement(SignInButton);
		
		loginEmailAddressElement.sendKeys(emailId);
		passwordFieldElement.sendKeys(password);	
		SignInButtonElement.click();
	}

}
