package date31_03_2024;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class passingCredentialsinURL {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//For Passing credentials in the URL SYNtax
		//https://stgmulti:g76hvmYoAUUsnGjd@stgassam-mt.news18.com/
		
		driver.get("https://stgmulti:g76hvmYoAUUsnGjd@stgassam-mt.news18.com/");
		driver.quit();

	}

}
