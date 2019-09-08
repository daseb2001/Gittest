package Sleniumclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunchbrowser {

	

	protected static void lunchBrowser(String website) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(website);
		driver.close();
	}


	}


