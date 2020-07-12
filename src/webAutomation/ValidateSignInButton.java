package webAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateSignInButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch the browser
		driver.get("http://automationpractice.com");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		TakesScreenshot sshot = (TakesScreenshot)driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement signInLink = driver.findElement(By.xpath("//a[@class='login']"));
		signInLink.click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Authentication']")));
		WebElement signInPage = driver.findElement(By.xpath("//h1[text()='Authentication']"));
		if(signInPage.isDisplayed()) {
			System.out.println("Succesfully opened the Authentication page");
		}
		
		WebElement emailIdField = driver.findElement(By.xpath("//input[@id='email_create']"));
		emailIdField.sendKeys("alphabetical@abc.com");
//		
		WebElement createAccButton = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		createAccButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Create an account']")));
		WebElement accountTitle = driver.findElement(By.xpath("//h1[text()='Create an account']"));
		
		if(accountTitle.isDisplayed()) {
			System.out.println("Page title matches the Expected title : Create An Account ");
		}else {
			System.out.println("FAILED: 'Create An Account' is not visible. Found Page with title : "+ accountTitle.getText());
		}

		
		driver.quit();

	}

}
