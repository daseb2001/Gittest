package naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDRop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions a = new Actions(driver);
		a.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']/p")))
		.moveToElement(driver.findElement(By.id("droppable")))
		.release()
		.build()
		.perform();
		
	}

}
