package naveen;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindodwPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Thread.sleep(2000);
		Set <String> handl= driver.getWindowHandles();
		Iterator<String>it=handl.iterator();
		String parentWiindow= it.next();
		System.out.println("parent:"+ parentWiindow);
		Thread.sleep(2000);
		String child= it.next();
		System.out.println("Child window id"+child);
		driver.switchTo().window(child);
		System.out.println("child window pop up title"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWiindow);
		System.out.println("parent window title"+driver.getTitle());
		
		
		
		
		
		
		
	}

}
