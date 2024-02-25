package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/radio");
		
		WebElement unchecked=driver.findElement(By.id("foo"));
		WebElement checked=driver.findElement(By.id("notfoo"));
		boolean uncheckedStatus=unchecked.isSelected();
		boolean checkedStatus=checked.isSelected();
		System.out.println(uncheckedStatus);
		System.out.println(checkedStatus);
		
		WebElement automaticfirstoption=driver.findElement(By.name("plan"));
		automaticfirstoption.click();

	}

}
