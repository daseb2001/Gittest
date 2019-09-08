package Sleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			// The below statement is to configur and launch browser
	System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 // This is to open the web
		 driver.get ("https://www.phptravels.net/");
		 
		// This is to maximize the window
		 driver.manage().window().maximize();
		 // This is to click on my account
		
		 driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).click();
		//This is to click on signup
		
		 driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/ul/li[2]/a")).click();
		
		 
		 
		 
		 driver.findElement(By.name("firstname")).sendKeys("Dagne");
		 
		 driver.findElement(By.name("lastname")).sendKeys("Trump");
		 
		 driver.findElement(By.name("phone")).sendKeys("2310000000");
		 
		 
		 driver.findElement(By.name("email")).sendKeys("Dagn2@gmail.com");
		 
		 driver.findElement(By.name("password")).sendKeys("Dagne1234");
		 
		 driver.findElement(By.name("confirmpassword")).sendKeys("Dagne1234");
		 driver.findElement(By.xpath("/html/body/div[5]/section/div/div/div/div/div[3]/div/form/div[9]/button")).click();
		 Thread.sleep(9000);
		 //click on profile
		 driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/ul/li[2]/a")).click();
		 
		
		 }
		

		
			
			
		



	}


