package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/alert");
		
		WebElement alertbox=driver.findElement(By.id("accept"));
		alertbox.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmbox=driver.findElement(By.id("confirm"));
		confirmbox.click();
		Alert confirmAlert=driver.switchTo().alert();
		confirmAlert.dismiss();
		
		WebElement promptbox=driver.findElement(By.id("prompt"));
		promptbox.click();
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("naveen");
		promptAlert.accept();
		
	}

}
