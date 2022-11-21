package week_2day2;

public class Dropdown 
public static void main(String[] args) { 
WebDriverManager.chromedriver().setup();
ChromeDriver  driver = new  ChromeDriver();
driver.get("https://leafground.com/select.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement Selectool = driver.findElement(By.className("ui-selectonemenu"));


{

}
