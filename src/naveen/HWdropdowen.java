package naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HWdropdowen {

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
		String dob = "15-Jul-1996";
		String dobAR [] =dob.split("-");
		dropdown(month,dobAR[1]);
		dropdown(date,dobAR[0]);
		dropdown(year,dobAR[2]);
		
	}
    public static void dropdown(WebElement element, String value){
    Select s = new Select(element);	
    s.selectByVisibleText(value);
    }
}
