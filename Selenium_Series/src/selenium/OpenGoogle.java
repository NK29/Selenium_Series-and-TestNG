package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// 1. open chrome
		//2. google home page
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Karth\\Downloads\\Driver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.google.co.in"); 
		driver.manage().window().maximize();
		//driver.close();
		

	}

}
