package web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\LearningHat\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch the browser
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		//Alert
		Alert alertDemo = driver.switchTo().alert();
		String alertText = alertDemo.getText();
		if(alertText.equals("Registered Successfully")) {
			// PAssed success
		}else {
			//Failed
			
		}
		

	}

}
