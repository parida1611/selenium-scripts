package web;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumClass {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		
		//Run On Chrome
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch the browser
		driver.get("http://automationpractice.com");
		
		driver.manage().window().maximize();

		
		
//		WebElement searchBox = driver.findElement(By.xpath("//*[@id='search_query_top']"));
//		searchBox.sendKeys("Hello World");
//		
//		WebElement searchBtn = driver.findElement(By.xpath("//*[@id='searchbox']/button"));
//		searchBtn.click();
		
//		//WebElement signIn = 
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);

		
		 Wait<WebDriver> waiter = new FluentWait<WebDriver>(driver).pollingEvery(5, TimeUnit.SECONDS).withTimeout(5, TimeUnit.SECONDS);
//
//		////*[@id="email_create"]
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("hellomm@wmmorld.com");
		
		waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='SubmitCreate']")));
//		
//		
//		driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
		
		WebDriverWait wait30Sec = new WebDriverWait(driver, 30);
		wait30Sec.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='id_gender1']"))));
		
		
		driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
		

//		
//		driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys("Automation");
//		
//		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("userPassword");
//		
//		driver.findElement(By.xpath("//*[@id='newsletter']")).click();
//		
//		Select dayDropDown = new Select(driver.findElement(By.xpath("//*[@id='days']")));
//		dayDropDown.selectByIndex(3);
//		dayDropDown.selectByValue("4");
//		dayDropDown.selectByVisibleText("17  ");
		
//File originalFile = sshot.getScreenshotAs(OutputType.FILE);
//		
//		File destinationPath = new File("C:\\Users\\Rajlaxmi\\Documents\\LearningHat\\screenshot\\screen1.jpg");
//		try {
//			Files.copy(originalFile, destinationPath);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//driver.quit();
    	
	}
}

