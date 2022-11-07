package TestUI_MyStore;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationwithoutAddressInfo {
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Browserdriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL = "http://automationpractice.com/index.php";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);	
		// Creating Account		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("email_create")).sendKeys("randhirall250@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//Entering Personal Information
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Randhir");
		driver.findElement(By.id("customer_lastname")).sendKeys("Karn");
		driver.findElement(By.id("passwd")).sendKeys("automation");
		driver.findElement(By.id("years")).click();
		driver.findElement(By.xpath("//*[@id=\"years\"]/option[27]"));
		driver.findElement(By.xpath("//*[@id=\"years\"]/option[27]")).click();
		driver.findElement(By.id("months")).click();
		driver.findElement(By.xpath("//*[@id=\"months\"]/option[8]")).click();
		driver.findElement(By.id("days")).click();
		driver.findElement(By.xpath("//*[@id=\"days\"]/option[24]")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("other")).sendKeys("Change World with Automation");
		driver.findElement(By.id("phone_mobile")).sendKeys("123456789");
		driver.findElement(By.id("alias")).sendKeys(" is Nepal");
		driver.findElement(By.id("submitAccount")).click();
	}
}
