package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RefreshWays {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new FirefoxDriver();
		//driver.navigate().to("https://google.co.in"); 
		driver.get("https://google.co.in"); 
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("star");
		
		/*
		 * Refresh command 
		 * driver.navigate().refresh();
		 */
		
		/*
		 * Get current URl 
		 * driver.get(driver.getCurrentUrl());
		 */
		
		/*
		 * JavaScriptExecutor 
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("location.reload()");
		 * executor.executeScript("history.go(0)");
		 */
		
		  Robot robot = new Robot(); 
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		 
		
		
		/*F5 via sendkey-> not working
		But its listed on almost all the sites
		sendKeys using ASCII code-> \uE035 is F5 equivalent -> not working
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(key.F5);
		*/
		
		
		
	}

}
