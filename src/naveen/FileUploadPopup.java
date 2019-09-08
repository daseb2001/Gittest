package naveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://html.com/input-type-file/");
		driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys("C:\\Users\\Dagnachew\\Desktop\\Report.JPG");
	}

}
