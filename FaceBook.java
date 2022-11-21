package week_2day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();// Click on Create New Account button		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Gowtham");//Enter the first name
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Raja");//Enter the last name
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("988421375");//Enter the mobile number
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Welcome@123");//Enterthe password
		
		//Day Dropdown
		WebElement dayd1 = driver.findElement(By.id("day"));
		Select d1=new Select(dayd1);
		d1.selectByVisibleText("12");
		
		//month dropdown
		WebElement monthd2 = driver.findElement(By.id("month"));
		Select d2=new Select(monthd2);
		d2.selectByVisibleText("/Jan");
		
		//year dropdown
		WebElement yeard3 = driver.findElement(By.id("year"));
		Select d3=new Select(yeard3);
		d3.selectByVisibleText("1990");
		
		//Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='male]")).click();
		Thread.sleep(3000);
		
		driver.close();
	
		
	}
}
