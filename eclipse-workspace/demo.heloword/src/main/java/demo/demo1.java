package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {                    //Syntax:
	                                     //"uniq Ele /axesMethodName::tagName"

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("http://facebook.com");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pram@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("990990");
		 driver.findElement(By.name("login")).click();
		 
	}

}
// we use the contains method with the X path for partials text and 
//attributes but the value or the Name is case sensitive and should  be in order
////a[contains(text(),'Forgotten password?')]
////a[contains(@data-testid,'form-button')]
//Example for "Following sibling" mrthod :->
//("//label[contains(text(),'Email')]/ following-sibling::input[@type='text']")