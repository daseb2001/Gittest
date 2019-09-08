package naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisoblity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://register.freecrm.com/register/");
		Boolean b1 =driver.findElement(By.name("action")).isDisplayed();
		System.out.println(b1);
		boolean b2=driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2);
		
		
	}

}
