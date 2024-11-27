package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollingIntoView {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
       WebElement ele = driver.findElement(By.xpath("//strong[text()='Community poll']"));
	   System.out.println(ele.isDisplayed());
	   
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));

	} 

}
