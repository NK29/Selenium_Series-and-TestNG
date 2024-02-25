package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchResultLinks {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:/www.google.co.in"); 
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("12 angry men \n");
		Thread.sleep(5000);
		/*
		 * List<WebElement>TotalLinks=driver.findElements(By.xpath("//a")); //This will
		 * print all the URLs in the page for (WebElement links : TotalLinks) {
		 * System.out.println(links.getAttribute("href")); }
		 */
		
		//Fetch main Links
		List<WebElement>TotalLinks=driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		for (WebElement Links : TotalLinks) {
			System.out.println(Links.getText());
		}
		
	}

}
