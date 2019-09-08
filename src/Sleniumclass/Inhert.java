package Sleniumclass;
import Sleniumclass.lunchbrowser;
public class Inhert extends lunchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Sits\\chromedriver.exe");
		lunchBrowser("http://facebook.com/");
		
	}

}
