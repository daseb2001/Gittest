package locator;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Multywindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
	    driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[1]/a")).click();
	    //driver.findElement(By.xpath("//*[@id='initialView']/footer/ul/li[2]/a")).click();
	    System.out.println( driver.getTitle());
	    Set<String>id=driver.getWindowHandles();
	   Iterator<String> it=id.iterator();
	   String Pid=it.next();
	   String chid=it.next();
	  // String gchid=it.next();
	   driver.switchTo().window(chid);
	  System.out.println(  driver.getTitle());
	  driver.switchTo().window(Pid);
	  System.out.println(  driver.getTitle());
	
	}

}
