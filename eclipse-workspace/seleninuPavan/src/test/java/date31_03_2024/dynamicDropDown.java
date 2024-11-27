package date31_03_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		WebElement ele1 = driver.findElement(By.xpath("//textarea[@name='q']"));
		ele1.sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
		
		
//		for(WebElement ele:autoSuggestions) {
//			
//			String text = ele.getText();
//			if(text.equalsIgnoreCase("Selenium Webdriver")) {
//				ele.click();
//			}
//		}
		for(int i=0;i<autoSuggestions.size();i++) {
			String elements = autoSuggestions.get(i).getText();
			
			System.out.println(elements);
			if(elements.equals("selenium python")) {
				autoSuggestions.get(i).click();
				break;
			}
		}
driver.quit();
	}}


