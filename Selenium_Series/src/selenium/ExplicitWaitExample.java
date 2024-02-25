package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Applicationchrome.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.phptravels.net/login"); 
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("user@phptravel.com");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("demouser");
		
		WebElement submit=driver.findElement(By.id("submitBTN"));
		submit.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a")));
		profile.click();	
		driver.quit();

	}

}
