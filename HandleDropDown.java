package week_2day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
	        
	        ChromeDriver driver=new ChromeDriver();
	        
	       
	        
	        driver.get("(https://leafground.com/select.xhtml");
	        driver.manage().window().maximize();
	        
	        
	}
}
