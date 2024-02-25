package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotExample {

	public static void main(String[] args) throws IOException, AWTException {
		/*
		 * System.setProperty("webdriver.firefox.driver",
		 * "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		 */
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.leafground.com/alert.xhtml");
		
		//Take a screenshot here
//		TakesScreenshot screenShot = (TakesScreenshot) driver;
//		File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
//		File destinationFile = new File("C://Users//Karth//Pictures//sample.png");
//		FileHandler.copy(sourceFile, destinationFile);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		
		//Take full a screenshot here
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		File destinationFile = new File("C://Users//Karth//Pictures//robotsnap.png");
		ImageIO.write(source, "png", destinationFile);
	}

}
