package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadExample {

	public static void main(String[] args){
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Karth\\Downloads\\Firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://letcode.in/file");
		
		WebElement dowloadLink=driver.findElement(By.linkText("Download Excel"));
		dowloadLink.click();
File fileLocation=new File("C:\\Users\\Karth\\Downloads");
File[]totalFiles=fileLocation.listFiles();
for (File file : totalFiles) {
	if(file.getName().equals("sample.xlsx")) {
		System.out.println("File is downloaded");
		break;
			}
		}
	}
}
