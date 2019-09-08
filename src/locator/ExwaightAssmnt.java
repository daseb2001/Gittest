package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExwaightAssmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait d = new WebDriverWait (driver,20);
		driver.findElement(By.xpath("//*[@id='content']/a[2]")).click();
		d.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("results")));
				//((By.id("results"), "Process completed");
				//driver.findElement(By.id("results"))
	}

}
