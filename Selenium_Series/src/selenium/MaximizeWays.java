package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWays {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		//driver.get("http:/www.google.co.in"); 
		//driver.manage().window().maximize();
		
		/*
		 * Dimension dimension= new Dimension(800,468);
		 * driver.manage().window().setSize(dimension);
		 */

		
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-Maximized"); 
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("http:/www.google.co.in"); 
	}

}
