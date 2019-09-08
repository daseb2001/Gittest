package naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a/span[2]")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("daseb2001@yahoo.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Toyota2014");
        driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
	}

}
