package week_2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RadioButApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		//Are you enjoying the classes?
		driver.findElement(By.id("yes")).click();
		Thread.sleep(2000);
		
		//Find default selected radio button
		 boolean sel1 = driver.findElement(By.xpath("//label[text()='Find default selected radio button']/following::input")).isSelected();
		 boolean sel2 = driver.findElement(By.xpath("(//label[text()='Find default selected radio button']/following::input)[2]")).isSelected();
		if(sel1==true)
		{
			System.out.println("The Unchecked radio button is selected");
		}
		else if (sel2==true)
		{
			System.out.println("The Checked radio button is selected");
		}
		else
		{
			System.out.println("None of the radio button is selected");
		}
		
		
		//Select your age group (only if choice wasn't selected)
		boolean selage = driver.findElement(By.xpath("(//input[@name='age'])[2]")).isSelected();
		if(selage==true)
		{
			System.out.println("My age group is already selected.");
		}
		driver.close();
	}

	}

}
