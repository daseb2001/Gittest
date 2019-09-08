package Sleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeworkconditional {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.phptravels.net/");
		for (int x=20;x<26;x=x+1){
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).click();
		//To click on signup
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/ul/li[2]/a")).click();
		//to Register
		if (x==20){
		driver.findElement(By.name("firstname")).sendKeys("Dagne");
		 
		 driver.findElement(By.name("lastname")).sendKeys("Trump");
		 
		 driver.findElement(By.name("phone")).sendKeys("2310000000");
		}
		else if (x==21){
			driver.findElement(By.name("firstname")).sendKeys("Barack");
			 
			 driver.findElement(By.name("lastname")).sendKeys("Obama");
			 
			 driver.findElement(By.name("phone")).sendKeys("23100123");
			}
		
		else if (x==22){
			driver.findElement(By.name("firstname")).sendKeys("Clinton");
			 
			 driver.findElement(By.name("lastname")).sendKeys("Bill");
			 
			 driver.findElement(By.name("phone")).sendKeys("2310000000");
			}
		else {
			driver.findElement(By.name("firstname")).sendKeys("Kenedy");
			 
			 driver.findElement(By.name("lastname")).sendKeys("Jhan");
			 
			 driver.findElement(By.name("phone")).sendKeys("2310000000");
			}
		
		
		
		 driver.findElement(By.name("email")).sendKeys("Daagn2@gmail.com");
		 
		 driver.findElement(By.name("password")).sendKeys("Dagne1234");
		 
		 driver.findElement(By.name("confirmpassword")).sendKeys("Dagne1234");
		 driver.findElement(By.xpath("/html/body/div[5]/section/div/div/div/div/div[3]/div/form/div[9]/button")).click();
		 Thread.sleep(9000);
		 //click on profile
		 driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul[2]/ul/li[1]/ul/li[2]/a")).click();
		 
		}	 
	}

}
