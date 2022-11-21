package week_2_day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownapp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Select training program using index
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select d1=new Select(drop1);
		d1.selectByIndex(2);
		
		//Select training program using Text
		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select d2=new Select(drop2);
		d2.selectByVisibleText("Loadrunner");
		
		//Select training program using Value
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select d3=new Select(drop3);
		d3.selectByValue("3");
		
		//Get the number of dropdown options
		WebElement drop4 = driver.findElement(By.className("dropdown"));
		Select d4=new Select(drop4);
		int size = d4.getOptions().size();
		System.out.println("The number of options in Dropdown are "+size);
		
		//You can also use sendKeys to select
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']//parent::select")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//option[text()='You can also use sendKeys to select']//following-sibling::option)[1]")).click();
		Thread.sleep(1000);
		
		//Select your programs
		driver.findElement(By.xpath("//option[text()='Select your programs']//following-sibling::option[4]")).click();
		//Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("//option[text()='Select your programs']//following-sibling::option[4]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
		Thread.sleep(4000);
		driver.close();

}
}
