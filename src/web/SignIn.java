package web;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SignIn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch the browser
		driver.get("http://automationpractice.com");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TakesScreenshot sshot = (TakesScreenshot)driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement signInLink = driver.findElement(By.xpath("//a[@class='login']"));
		signInLink.click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Authentication']")));
		WebElement signInPage = driver.findElement(By.xpath("//h1[text()='Authentication']"));
		signInPage.isDisplayed();
		
		WebElement emailIdField = driver.findElement(By.xpath("//input[@id='email_create']"));
		emailIdField.sendKeys("alphabetical@abc.com");
		
		WebElement createAccButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		createAccButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Create an account']")));
		WebElement accountTitle = driver.findElement(By.xpath("//h1[text()='Create an account']"));
		accountTitle.isDisplayed();

		
		driver.quit();
	}

}
