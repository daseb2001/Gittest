package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssmntAutodropdowen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
	driver.findElement(By.id("autocomplete")).sendKeys("Can");
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	String script="return document.getElementById('autocomplete').value;";
	String text=(String) js.executeScript(script);
	System.out.println(text);
	int i=0;
	while(!text.equalsIgnoreCase("CANADA"))
	{
		i++;
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		text=(String) js.executeScript(script);
		System.out.println(text);
		if (i>7)
		{
			break;
		}
		if(i>7)
		{
			System.out.println("Elemont not found");
		}
		
		else
		{
			System.out.println("Elemont  found");
		}
		
	}
	
	
	
	}

}
