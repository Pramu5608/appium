package date31_03_2024;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleDifferntAlrtes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()'][text()='Click for JS Confirm']")).click();
		//Hadling alerts with switchTo method
		//Alert alert = driver.switchTo().alert();
		//alert.getText();
		
		//Handling alerts with help of explict wait
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//alert.getText();
		
		alert.accept();
		//alert.dismiss();
		driver.close();
	}

}
