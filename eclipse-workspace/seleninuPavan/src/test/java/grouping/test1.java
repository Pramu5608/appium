package grouping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
WebDriver driver;
	
@BeforeMethod()
	public void setup() {
		
//		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		}



		
		@Test(dataProvider="dp")
		public void login(String name,String pass) {
			 
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(name);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		}
		
		@Test(groups="sanity")
		void  logoot() {
			
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();	
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		}
		
		@DataProvider(name="dp")
		Object[][] logindata() {
		String data[][]= {{"Admin","admin123"}};
		return data;
		}
		
		
	}
	


