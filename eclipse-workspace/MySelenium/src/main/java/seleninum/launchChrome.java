package seleninum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchChrome {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		 driver.get("www.google search web");
	}

}
