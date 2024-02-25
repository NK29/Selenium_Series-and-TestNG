package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.partialLinkText("Dashboard")).click();// Don't type all words, just type short words
	}

}
