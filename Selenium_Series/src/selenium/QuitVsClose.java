package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.firefox.driver",
		 * "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		 */
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/windows");
		
		WebElement firstbutton=driver.findElement(By.id("multi"));
		firstbutton.click();
		//driver.close(); //WebDriver close()->close the browser window that the driver has focus of
		driver.quit(); // classes all browser session associated to WebDriver

	}

}
