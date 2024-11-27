package testNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTest {
	WebDriver driver;
	@Test
	
	public void launchApplication() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		
		
	}
	@Test
	public void Login() throws IOException, InterruptedException {
		String File = System.getProperty("user.dir")+"\\testData\\cerentialsORangeHRM.xlsx";
		int rows = dataDriven.getLastrow(File, "Sheet1");
		
		//System.out.println(rows);
		for(int i=1; i<=rows;i++) {
			String userName = dataDriven.getCellData(File, "Sheet1", i, 0);
			String Password = dataDriven.getCellData(File, "Sheet1", i, 1);
			//System.out.println(userName);
			//System.out.println(Password);
			Thread.sleep(3000);
			WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			
			ele1.sendKeys(userName);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
		
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		}
		
		
	}
	@Test
	public void verifytext() {
		String te = "Dashboard";
		String text = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).getText();
		if(te.equalsIgnoreCase(text)) {
			System.out.println("pass");
		}
		
	}
	@Test
	public void qUIT(){
		driver.quit();
	}
	
}
