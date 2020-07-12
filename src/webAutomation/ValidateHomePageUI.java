package webAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateHomePageUI {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		TakesScreenshot srcShot = (TakesScreenshot)driver;	
	
		driver.get("http://automationpractice.com");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		try {
			//logo
			WebElement logo = driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/logo.jpg']"));
			if(logo.isDisplayed()) {
				System.out.println("Logo displayed successfully");
			}else {
				System.out.println("Logo not displayed successfully");
			}
			
			//SearchBox
			WebElement searchBox = driver.findElement(By.xpath("//*[@id='search_query_top']"));
			
			if(searchBox.isDisplayed()) {
				System.out.println("Search Box displayed successfully");
			}else {
				System.out.println("Search Box not displayed successfully");
			}
			
			//Cart
			WebElement cartbox = driver.findElement(By.xpath("//*[text()='Cartbox']"));
			
			if(cartbox.isDisplayed()) {
				System.out.println("Cart box displayed successfully");
			}else {
				System.out.println("Cart box not displayed successfully");
			}	
			
			
		}catch(Exception e) {
			
			System.out.println("Failed due to: " + e.getMessage());
			
		}
		
		driver.quit();

	}

}
