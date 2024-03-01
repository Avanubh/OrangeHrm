package Maven_Project.TestNG_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	@SuppressWarnings("deprecation")
	public void login() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement inputField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	
	inputField.sendKeys("Admin");
	
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	
	password.sendKeys("admin123");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
