package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlinedOrNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		
		WebElement tamil= driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
		
		String beforeHovering= tamil.getCssValue("text-decoration");
		System.out.println("Before Hovering " +beforeHovering);
		
		Actions actions= new Actions(driver);
		actions.moveToElement(tamil);
		actions.perform();
		
		String afterHovering= tamil.getCssValue("text-decoration");
		System.out.println("After Hovering " +afterHovering);
		
	}

}
