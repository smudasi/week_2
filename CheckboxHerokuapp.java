package week_2_day1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxHerokuapp {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Select the Languages that you know?
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']//following-sibling::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Select the languages that you know?']//following-sibling::input[3]")).click();
		Thread.sleep(3000);
		
		//Confirm Selenium is Checked.
		//driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following-sibling::input"))
		boolean boo1 = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following-sibling::input")).isSelected();
		if(boo1==true)
		{
			System.out.println("Selenium Checkbox is checked");
		}
		else
		{
			System.err.println("Selenium Check box is not checked.");
			
		}
		Thread.sleep(2000);
		
		//Deselect only checked
		boolean sel1 = driver.findElement(By.xpath("//label[text()='DeSelect only checked']//following-sibling::input")).isSelected();
		boolean sel2 = driver.findElement(By.xpath("//label[text()='DeSelect only checked']//following-sibling::input[2]")).isSelected();
		
		if(sel1==true)
		{
			driver.findElement(By.xpath("//label[text()='DeSelect only checked']//following-sibling::input")).click();
		}
		else if (sel2==true)
		{
			driver.findElement(By.xpath("//label[text()='DeSelect only checked']//following-sibling::input[2]")).click();
		}
		Thread.sleep(2000);
		
		//select all below checkboxes
		List <WebElement> li= driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']//following-sibling::input"));
        System.out.println(li.size());
        for(int i=0;i<=li.size()-1;i++)
           {
              li.get(i).click();
           }

        
                Thread.sleep(3000);

		driver.close();
	}

}
