package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Applicationchrome.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.phptravels.net/login"); 
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("user@phptravel.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		
		WebElement submit=driver.findElement(By.id("submitBTN"));
		submit.click();
		
		WebElement profile=driver.findElement(By.xpath("//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a"));
		profile.click();
		
		driver.quit();


	}

}
