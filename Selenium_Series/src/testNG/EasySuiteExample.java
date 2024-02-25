package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class EasySuiteExample {
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		driver = new FirefoxDriver();
	}
	@Test
	public void openGoogle() {
		driver.navigate().to("https://www.google.co.in");
	}
	@Test
	public void openBing() {
		driver.navigate().to("https://www.Bing.com");
	}
	@Test
	public void openYahoo() {
		driver.navigate().to("https://www.Yahoo.com");
	}
	@AfterSuite
public void closeBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken"+totalTime);
	}

}
