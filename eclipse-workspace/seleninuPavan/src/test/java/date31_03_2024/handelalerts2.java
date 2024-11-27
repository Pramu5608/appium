package date31_03_2024;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handelalerts2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		
		//Handling alerts with help of explict wait
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String s = "ABCD";
		alert.sendKeys(s);
		//alert.accept();
		alert.dismiss();
		WebElement ele1 = driver.findElement(By.xpath("//h4[text()='Result:']/following::p[@id='result']"));
		String res = ele1.getText();
		//System.out.println(res);
		if(res.contains(s)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
	
		driver.quit();

	}

}
