package Sleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.linkText("REGISTER")).click();
	//To 
	
	driver.findElement(By.name("firstName")).sendKeys("Hilary");
	driver.findElement(By.name("lastName")) .sendKeys("Dagne");
	// This statment is for phone number
	driver.findElement(By.name("phone")).sendKeys("7030000");
	driver.findElement(By.name("userName")).sendKeys("ds@yahoo.com");
	driver.findElement(By.name("address1")).sendKeys("14th st Nw");
	driver.findElement(By.name("city")).sendKeys("Alexandria");
	driver.findElement(By.name("state")).sendKeys("VA");
	driver.findElement(By.name("postalCode")).sendKeys("22311");
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select/option[247]")).click();
	driver.findElement(By.id("email")).sendKeys("ds@yahoo.com");
	driver.findElement(By.name("password")).sendKeys("9");
	driver.findElement(By.name("confirmPassword")).sendKeys("9");
	driver.findElement(By.name("register")).click();
	
	
	
	}
	
}
