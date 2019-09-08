package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		driver.findElement(By.name("email")).sendKeys("Test");
		driver.findElement(By.id("pass")).sendKeys("Test");
		/*@FindBy(name="email")
		
		
		@FindBy(id="pass")
		
		
		@FindBy (xpath="//*[@id='u_0_2']")
		WebElement loginBtn;*/
		
		
		
		
	}

}
