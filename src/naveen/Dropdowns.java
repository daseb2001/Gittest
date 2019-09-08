package naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.facebook.com/");
		WebElement month = driver.findElement(By.id("month"));
		WebElement date = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		/*Select s = new Select(month);
		s.selectByVisibleText("Jul");
		
		Select s1 = new Select(date);
		s1.selectByVisibleText("10");
		
		
		Select s2 = new Select(year);
		s2.selectByVisibleText("1999");
		*/
		String dob = "15-Jul-1996";
		String dobarr[]=dob.split("-");
		selectValueFromDropDown(month,dobarr[1]);
		selectValueFromDropDown(date,dobarr[0]);
		selectValueFromDropDown(year,dobarr[2]);
	}
public static void selectValueFromDropDown(WebElement element, String value){
	Select s = new Select(element);
			s.selectByVisibleText(value);
}
}
