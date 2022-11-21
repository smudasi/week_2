package week_2_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    //Enter password
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    //click login button
	    driver.findElement(By.className("decorativeSubmit")).click();
	    //cmrsfa 
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    System.out.println(driver.getTitle());
		//Click lead
		driver.findElement(By.linkText("Leads")).click();
		//click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("princial");
		//Enter lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("edward");
		//click create lead
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
	 String  title= driver.getTitle();//ctrl+2+l
		 System.out.println(title);
		
	    }

	  
	
}

