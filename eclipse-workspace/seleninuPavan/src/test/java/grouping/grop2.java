package grouping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class grop2 {
	public static WebDriver driver;
	@BeforeMethod
public void setup() {
		
//		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		}
	@Test (groups= {"group"})
	static void  t1() {
		String s = "Dashboard";
		
		String s1 = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		Assert.assertEquals(s, s1);
	}
	@Test (groups= {"group"})
	static void t2() {
String s3 = "Quick Launch";
		
		String s4 = driver.findElement(By.xpath("//p[normalize-space()='Quick Launch']")).getText();
		Assert.assertEquals(s3, s4);
	}
	@AfterMethod
	void  logoot() {
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();	
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}
}
