package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {

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
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))  // .withTimeout(30,TimeUnit.SECONDS)
				.pollingEvery(Duration.ofSeconds(30)) // .pollingEvery(3,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement profile.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a"));
			}
		});
		profile.click();
	}}