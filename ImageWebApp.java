package week_2day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ImageWebApp {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		Actions actions=new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Click on this image to go home page.
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);

		 String size = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).getAttribute("naturalWidth");
		 if(size.contentEquals("0")==true)
		 {
			 System.out.println("The image is broken");
		 }
		 else 
		 {
			 System.out.println("The image is not Broken");
		 }
		 
		 //Click me using KeyBoard or Mouse
		 WebElement key1 = driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"));
		 actions.moveToElement(key1).click().perform();
		 Thread.sleep(5000);
		 
		 driver.close();
	}


}
