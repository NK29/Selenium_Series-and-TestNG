package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PositionAndTextExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:/www.google.co.in"); 
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Game of Thrones");
		Thread.sleep(5000);
		/*
		 * List<WebElement>SearchSuggestions=driver.findElements(By.xpath(
		 * "//ul[@role='listbox']//following::li"));
		 * 
		 * int position=0;
		 * 
		 * for (WebElement webElement : SearchSuggestions) {
		 * System.out.println(webElement.getText()); position++;
		 * 
		 * if(position==5) { webElement.click(); break; }
		 * 
		 * }
		 */

		List<WebElement>SearchSuggestions=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
				
		for (WebElement webElement : SearchSuggestions) {
			String text = webElement.getText();
			 System.out.println(text); 
			 
			 if(text.contains("cast")) {
				 webElement.click();
				 break;
			 }
		
}
}
}