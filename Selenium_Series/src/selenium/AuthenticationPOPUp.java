package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPOPUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.google.co.in"); 
		driver.get("http://admin:admin@https://the-internet.herokuapp.com/basic_auth");

	}

}
