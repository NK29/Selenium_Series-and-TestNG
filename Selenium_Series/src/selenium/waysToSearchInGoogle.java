package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class waysToSearchInGoogle {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:/www.google.co.in");
		
		WebElement searchBox= driver.findElement(By.name("q"));
		 /* searchBox.sendKeys("Trichy"+Keys.ENTER);
		 */
		
			/*
			 * searchBox.sendKeys("trichy"); searchBox.submit();
			 */
		
			/* searchBox.sendKeys("trichy \n"); */
		
		
		searchBox.sendKeys("trichy");
		 Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
