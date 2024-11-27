package demo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRM {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void LaunchApp(String browserName) {
		switch(browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
		default:
			System.out.println("BrowserName is invalid");
			break;
	}}
	@Parameters("url")
		@Test
		
public void openURl(String url) {
		driver.get(url); 
	}

	@Parameters({"username","password"})
	@Test
	public void EnterLoginDetails(String username, String password ) throws Exception{
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	@Test
	public void NavigateToMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	
	@Test
	public void VerifyMyInfo() {
		boolean actualValue=driver.findElement(By.id("employee-details")).isDisplayed();
		assertTrue(actualValue);
		
	}
	
	@Test
	public void VerifyLogin() {
		WebElement element = driver.findElement(By.id("welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();
	}
}
