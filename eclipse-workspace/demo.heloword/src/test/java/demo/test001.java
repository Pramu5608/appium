package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test001 {
  @Test
  public void launch()throws Exception {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("http://facebook.com");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pram@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("990990");
		 driver.findElement(By.name("login")).click();
  }


	  }
