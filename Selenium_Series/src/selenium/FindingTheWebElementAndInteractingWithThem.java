package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingTheWebElementAndInteractingWithThem {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:/www.google.co.in");
		//enter a search term
		//click on wikipedia link
		driver.findElement(By.name("q")).sendKeys("Home"+Keys.ENTER);
	}

}
