package parallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parallel1 {
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException {
		
		
		//WebDriverManager.chromedriver().setup();
		
		
		switch(br.toLowerCase()) {
		
		case"chrome" : driver = new ChromeDriver(); break;
		case"edge" : driver = new EdgeDriver(); break;
		case"firefox" : driver = new FirefoxDriver(); break;
		default: System.out.println("InValid browser");return;
		}
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		
	}
	@Test
	void ele1() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();	
	}
	
	@AfterClass
	void close() {
		
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		driver.quit();
		
	}

}
