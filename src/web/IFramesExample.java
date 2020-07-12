package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch the browser
		driver.get("http://demo.guru99.com/test/guru99home");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement innerFrameElement = null;
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='a077aa5e']")));
		
		
		try {
			System.out.println("I am Try Block");
			 innerFrameElement = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
			 
			 if(innerFrameElement.isDisplayed()) {
					System.out.println("Element Displayed");
				}else {
					System.out.println("Element Not Displayed");
				}
				
				driver.switchTo().defaultContent();
			 
		}catch(Exception e) {
			System.out.println("I am catch Block");
			System.out.println("Facing Error:"+ e.getMessage());
		}
		
		
		driver.close();
		driver.quit();
		
		

	}

}
