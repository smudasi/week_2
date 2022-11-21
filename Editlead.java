package week_2day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Guna");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		String title2 = driver.getTitle();
		if(title2.contains("View Lead")) {
			System.out.println("The Find Lead page loaded correctly");
		}
		else {
			System.out.println("The Find Lead page not loaded");
		}
		
		driver.findElement(By.linkText("Edit")).click();
		//driver.findElement(By.xpath("((//div[@class='frameSectionExtra'])[2]/a)[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("EditTestLeaf");
		driver.findElement(By.name("submitButton")).click();
		String compName=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if(compName.contains("EditTestLeaf"))
		{
			System.out.println("Company name updated successfully");
		}
		else
		{
			System.out.println("Company name not updated");
		}
		
	driver.close();
		
		}
}
