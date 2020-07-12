package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch the browser
		driver.get("http://automationpractice.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		WebElement signInEle = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		
		action.moveToElement(signInEle)
			.contextClick()
			.build()
			.perform();
		
		WebElement searchBox = driver.findElement(By.xpath("//*[@id='search_query_top']"));
//		searchBox.sendKeys("Hello World");
		action.moveToElement(searchBox)
				.click()
				.keyDown(Keys.SHIFT)
				.keyDown(Keys.ALT)
				.sendKeys("hello world of actions")
				.keyUp(Keys.ALT)
				.keyUp(Keys.SHIFT)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
		
	}

}
