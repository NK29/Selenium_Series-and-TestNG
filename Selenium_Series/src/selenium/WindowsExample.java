package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/windows");
		
		String oldWindow=driver.getWindowHandle();
		
		WebElement firstbutton=driver.findElement(By.id("home"));
		firstbutton.click();
		
		Set<String>handles=driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		WebElement editbox=driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a"));
		editbox.click();
		driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement openMultiple=driver.findElement(By.id("multi"));
		openMultiple.click();
		int numberOfWindows=driver.getWindowHandles().size();
		System.out.println("Number of windows opened:"+numberOfWindows);
		
		WebElement dontCloseParentwindow=driver.findElement(By.xpath("//*[@id=\"multi\"]"));
		dontCloseParentwindow.click();
		Set<String>newWindowHandles=driver.getWindowHandles();
		for (String allWindows : newWindowHandles) {
			if(!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close(); //child window
			}	
		}
		driver.quit();//parent window
	}
}
