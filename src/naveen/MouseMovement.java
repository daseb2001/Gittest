package naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.com/gp/cart/view.html");
				Actions a = new Actions(driver);
				a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"))).build().perform();
				driver.findElement(By.xpath("//*[@class='nav-text']")).click();
				
				//*[@id='nav_prefetch_yourorders']/span
				
				
				
				
	}

}
