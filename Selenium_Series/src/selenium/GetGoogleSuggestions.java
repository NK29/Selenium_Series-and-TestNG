package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:/www.google.co.in"); 
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Game of Thrones");
		//Thread.sleep(5000);
		List<WebElement>SearchSuggestions=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement webElement : SearchSuggestions) {
			System.out.println(webElement.getText());
		}

	}
}
