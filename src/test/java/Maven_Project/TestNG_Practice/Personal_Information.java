package Maven_Project.TestNG_Practice;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Personal_Information {
	WebDriver driver=null;
	
@SuppressWarnings("deprecation")
@Test
  public void f() {
	  	System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement variable = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		variable.sendKeys("Admin");
		
		 variable = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		variable.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
  }


}
