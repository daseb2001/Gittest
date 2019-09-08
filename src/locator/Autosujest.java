package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosujest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.id("hp-widget__sfrom")).clear();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("MUM");
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement dest=driver.findElement(By.id("hp-widget__sTo"));
		dest.clear();
		dest.sendKeys("MUM");
		//for (int i=1; i<3; i++)
		
		dest.sendKeys(Keys.ARROW_DOWN);
		
		dest.sendKeys(Keys.ENTER);
		
	
	}
	

}
