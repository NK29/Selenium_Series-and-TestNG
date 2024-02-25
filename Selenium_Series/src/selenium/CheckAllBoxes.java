package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		List<WebElement>allBoxes=driver.findElements(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']"));
		for (WebElement element : allBoxes) {
			element.click();
		}
		
		List<WebElement>allBoxes1=driver.findElements(By.xpath("//div[@class='ui-chkbox ui-widget']"));
		for (WebElement element1 : allBoxes1) {
			element1.click();
		}

	}

}
