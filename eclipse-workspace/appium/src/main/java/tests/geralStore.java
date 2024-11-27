package tests;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.driverUtility.NewTest;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class geralStore extends NewTest {
	
	//public geralStore(AndroidDriver driver) {
		//this.driver =driver;
	//}
	
	
	@Test
	public void test2() throws Exception{
		
		this.driver =driver;
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logIn log =new logIn(driver);
		log.getele1().click();
		driver.findElement(AppiumBy.id("android:id/text1")).click();
		gUtil.scrollGesture("India");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='India']")).click();
		 driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Pramod");
		log.getele2().click();
		
		
		//driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"));"));
		//driver.quit(); 
	
}}


