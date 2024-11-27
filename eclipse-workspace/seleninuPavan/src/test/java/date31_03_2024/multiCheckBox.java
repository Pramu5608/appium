package date31_03_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#google_vignette");
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
				

		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
