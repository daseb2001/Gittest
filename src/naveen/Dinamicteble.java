package naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dinamicteble {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.freecrm.com/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a/span[2]")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("daseb2001@yahoo.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Toyota2014");
        driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
        //driver.switchTo().frame("display: none;");
        Thread.sleep(3000);
        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/a[3]/span")).click();
      //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
     //   /html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
        
       ///html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2] 
        String before_xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
        String After_xpath ="]/td[2]";
        for (int i=1; i<=4; i++){
        	String name = driver.findElement(By.xpath(before_xpath+i+ After_xpath)).getText();
        	System.out.println(name);
        	if(name.contains("Jeffry Al")){
        	
        	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]")).click();
        	}
        }
        
	}

}
