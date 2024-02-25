package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExamples {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Applicationchrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://support.infotools.com/hc/en-us/articles/360024299574-Dashboard-Links");
		
		//scroll to some position
		 //JavascriptExecutor executor =(JavascriptExecutor)driver;
		/* executor.executeScript("window.scroll(0,450)", ""); Thread.sleep(3000);
		 * executor.executeScript("window.scroll(0,-450)","");
		 */
		 
		// Go to the bottom of the page
		/*
		 * executor.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		 * Thread.sleep(3000); executor.executeScript("window.scroll(0,0)", "");
		 */
		 
		 // Go to a specific element position
			/*
			 * WebElement link = driver.findElement(By.linkText("Text container"));
			 * executor.executeScript("arguments[0].scrollIntoView(true);" , link);
			 */
		 
		 //Using Robot
		 Robot robot= new Robot();
		 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(3000);
		 robot.keyPress(KeyEvent.VK_PAGE_UP);
		 robot.keyRelease(KeyEvent.VK_PAGE_UP);

	}
}