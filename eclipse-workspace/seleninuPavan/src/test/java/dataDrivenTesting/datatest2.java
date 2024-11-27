package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import testNG.dataDriven;

public class datatest2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String File = System.getProperty("user.dir")+"\\testData\\cerentialsORangeHRM.xlsx";
		int rows = dataDriven.getLastrow(File, "Sheet1");
		
		System.out.println(rows);
		for(int i=1; i<=rows;i++) {
			String userName = dataDriven.getCellData(File, "Sheet1", i, 0);
			String Password = dataDriven.getCellData(File, "Sheet1", i, 1);
			Thread.sleep(3000);
			System.out.println(userName);
			System.out.println(Password);
			WebElement ele1 = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			ele1.click();
			ele1.sendKeys(userName);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
		
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

	}}
