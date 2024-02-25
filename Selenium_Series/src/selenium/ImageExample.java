package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leafground.com/pages/Image.html");
		
		WebElement firstImage=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
		firstImage.click();
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		//"naturalWidth"=0
		if(brokenImage.getAttribute("naturalWidth").equals("0")){
			System.out.println("the image is broken");
		}else {
			System.out.println("the image is not broken");
		}
	}
}