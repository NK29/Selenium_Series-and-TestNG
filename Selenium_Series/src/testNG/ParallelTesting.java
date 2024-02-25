package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	@Test
	public void opengoogle() {
	System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.google.co.in");
	driver.quit();
	}
	@Test
	public void openBing() {
	System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.Bing.com");
	driver.quit();
	}
}