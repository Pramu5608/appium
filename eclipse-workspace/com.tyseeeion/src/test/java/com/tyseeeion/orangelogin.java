package com.tyseeeion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangelogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Open app
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Explicit waits
				//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//WebElement	ele1=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@name='username']"))));
	WebElement ele1= driver.findElement(By.xpath("//input[@placeholder='Username']"));
//		
	ele1.sendKeys("Admin");
	WebElement ele2= driver.findElement(By.xpath("//input[@name='password']"));
	ele2.sendKeys("admin123");
	WebElement ele3= driver.findElement(By.xpath("//button[@type='submit']"));
	ele3.click();
		driver.findElement(By.xpath("//p[@class = 'oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	
		driver.close();

	}

}
