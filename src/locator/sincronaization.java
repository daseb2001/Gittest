package locator;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;


public class sincronaization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.VACATIONPACKAGES.PACKAGE");
		driver.findElement(By.name("FrAirport")).sendKeys("nyc");
		driver.findElement(By.name("DestName")).sendKeys("Was");
		driver.findElement(By.name("DestName")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("DestName")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("FH-fromDate")).sendKeys(Keys.TAB);
		driver.findElement(By.className("datepicker-day-number notranslate")).click();
		WebDriverWait d = new WebDriverWait (driver,20);
		//d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator)
				
	}

}
