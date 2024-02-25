package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksExtendedExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		WebElement homepageLink=driver.findElement(By.linkText("Go to Dashboard"));
		homepageLink.click();
		driver.navigate().back();
		
		WebElement wheretoGo=driver.findElement(By.partialLinkText("Find"));
		String where=wheretoGo.getAttribute("href");
		System.out.println("this link is going to "+where);
		
		WebElement brokenLink=driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		String title=driver.getTitle();
		if(title.contains("404")) {
			System.out.println("link is broken");
		}
		driver.navigate().back();
		
		WebElement homepageLink1=driver.findElement(By.linkText("Go to Dashboard"));
		homepageLink1.click();
		driver.navigate().back();
		
		List<WebElement>totalLinks=driver.findElements(By.tagName("a"));
		int linkcount=totalLinks.size();
		System.out.println("toal links:"+linkcount);
	}

}
