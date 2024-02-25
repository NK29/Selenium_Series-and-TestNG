package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/buttons");
		
		//Get the x and y position
	WebElement getpositionbutton=driver.findElement(By.id("position"));
	Point xypoint=getpositionbutton.getLocation();
	int xvalue=xypoint.getX();
	int yvalue=xypoint.getY();
	System.out.println("x value is:"+xvalue+" y value is:"+yvalue);
	
	// find the color
	WebElement colorbutton=driver.findElement(By.id("color"));
	String color=colorbutton.getCssValue("background-color");
	System.out.println("button color is:"+color);
	
	//find the size 
	WebElement sizebutton=driver.findElement(By.id("property"));
	int heigth=sizebutton.getSize().getHeight();	
	int width=sizebutton.getSize().getWidth();
	System.out.println("height is:"+heigth+" width is:"+width);
	
	//go to home page
	WebElement homebutton=driver.findElement(By.id("home"));
	homebutton.click();
	
	}

}
