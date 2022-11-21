package week_2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class EditHapp {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Enter your email address
		driver.findElement(By.id("email")).sendKeys("gowthamgeo@gmail.com");
		
		//Append a text and press keyboard tab
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("TestLeadf");
		
		//Get default text entered
		String text = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println("The Default text entered is "+text);
		
		//Clear the text
		driver.findElement(By.xpath("(//label[@for='uname'])[2]/following-sibling::input")).clear();
		
		//Confirm that edit field is disabled
		boolean a = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		
		if (a==false)
		{
			System.out.println("I confirm that field is disabled.");
		}
		else
		{
			System.out.println("The field is not disabled.");
		}
		driver.close();

}

}
