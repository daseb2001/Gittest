package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToend {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	
	
	   driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

       driver.findElement(By.cssSelector("a[value='DEL']")).click();     
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();//to click destination you need to use parent chiled xpath
       driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.  ui-state-active")).click();
	   System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
	
	
	
	}

}
