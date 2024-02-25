package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
public class ActiveElementExample {
static WebElement q;
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Documents\\Naveen Kumar S\\Driver\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.google.co.in"); 
		
		//driver.switchTo().activeElement().sendKeys("trichy \n");

		PageFactory.initElements(driver, ActiveElementExample.class);
		q.sendKeys("trichy \n");
		
	}

}
