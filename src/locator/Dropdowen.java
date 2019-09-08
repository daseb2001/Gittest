package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdowen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/"); //url for the browser.
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		/*driver.findElement(By.id("divpaxinfo")).click();
	System.out.println(	driver.findElement(By.id("divpaxinfo")).getText());
	for(	int i=1;i<5;i++)
		 
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		
		//System.out.println(	driver.findElement(By.id("divpaxinfo")).getText());
		}*/
	/*driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1']")).click();
	driver.findElement(By.xpath(".//a[@value='BLR']")).click();
	Thread.sleep(2000);
	   driver.findElement(By.xpath(".//a[@value='MAA']")).click();*/
	
	   driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

       driver.findElement(By.cssSelector("a[value='DEL']")).click();     

       // Destination

       //driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

     //driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();       
       //driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
      // driver.findElement(By.xpath("//a[@value='MAA']")
       Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();//to click destination you need to use parent chiled xpath

 //      driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	
	
	
	}

}
