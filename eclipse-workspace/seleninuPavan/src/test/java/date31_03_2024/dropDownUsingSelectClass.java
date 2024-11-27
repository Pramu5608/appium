package date31_03_2024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownUsingSelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement course = driver.findElement(By.xpath("//select[@id='course']"));
		course.click();
		Select se = new Select(course);
		//se.selectByValue("java");
		se.selectByVisibleText("Java");
List<WebElement> eles = se.getOptions();
for(int i=0;i<eles.size();i++) {
	WebElement element = eles.get(i);
	System.out.println(element.getText());
	
}
driver.close();
	}
	

}
