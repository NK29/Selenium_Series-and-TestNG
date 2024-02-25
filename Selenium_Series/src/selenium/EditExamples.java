package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EditExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/edit");
		
		/* (WorkingWithTextBox)
		driver.findElement(By.id("fullName")).sendKeys("sknaveenkumar29@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"join\"]")).sendKeys(" Karthik");
		
		String value = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(value);
		
		driver.findElement(By.id("clearMe")).clear();
		*/

		WebElement emailBox=driver.findElement(By.id("fullName"));
		emailBox.sendKeys("sknaveenkumar29@gmail.com");
		
		WebElement appendBox=driver.findElement(By.xpath("//*[@id=\"join\"]"));
		appendBox.sendKeys(" Karthik");
		
		WebElement getTextBox=driver.findElement(By.id("getMe"));
		String value=getTextBox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearBox=driver.findElement(By.id("clearMe"));
		clearBox.clear();
		
		WebElement disableBox=driver.findElement(By.xpath("//*[@id=\"noEdit\"]"));
		boolean enabled=disableBox.isEnabled();
		System.out.println(enabled);
	}

}
