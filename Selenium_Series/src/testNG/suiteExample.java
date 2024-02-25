package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class suiteExample {
	@Test
	public void openGoogle() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.google.co.in");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken"+totalTime);
	}
	
	@Test
	public void openBing() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.Bing.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken"+totalTime);
		
	}
	
	@Test
	public void openYahoo() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.Yahoo.com");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken"+totalTime);
	}
}
