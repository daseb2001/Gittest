package Sleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");

WebDriver driver = new ChromeDriver ();
driver.get("https://www.makemytrip.com/");
// to click on check box
System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());
driver.findElement(By.xpath("//*[@id='multicity']/label")).click();
// After click
System.out.println(driver.findElement(By.xpath("//*[@id='hp-widget__return']")).isDisplayed());



	}

}
