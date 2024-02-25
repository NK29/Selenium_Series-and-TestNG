package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/dropdowns");
		
		// 1,2 and 3 index,value,visibleText
		WebElement dropdown1= driver.findElement(By.id("fruits"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);  
		select.selectByValue("2");
		select.selectByVisibleText("Pine Apple");
		
		//TEST selectByValue
		WebElement dropdown2= driver.findElement(By.id("country"));
		Select select1 = new Select(dropdown2); 
		select1.selectByValue("Chile");
		
		//size
		List<WebElement> listofoptions=select.getOptions();
		int size = listofoptions.size();
		System.out.println("number of elements:"+size);
		
		//sendkeys
		dropdown1.sendKeys("Apple");
		
		//multi-selecting options
		WebElement multiselect=driver.findElement(By.id("superheros"));
		Select multiselectbox= new Select(multiselect);
		multiselectbox.selectByIndex(4);
		multiselectbox.selectByIndex(3);
		multiselectbox.selectByIndex(5);
	}

}
