package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetVsNavigate {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.firefox.driver",
		 * "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		 */
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://google.co.in");
		
	driver.navigate().to("https://google.co.in");
	driver.findElement(By.className("gLFyf")).sendKeys("ducking"+Keys.ENTER);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	}
}

//Get
//Get will not store the history
//DOm will wait to appear all the elements
//
//Navigate
//Navigate will store the history
//Dom will not wait to appear all the elements