package date31_03_2024;


import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmLoginTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.name("username")).click();
	}

}
