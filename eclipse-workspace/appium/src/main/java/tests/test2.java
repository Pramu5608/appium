package tests;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class test2 {
	@Test
	public void test2() throws Exception{
		
		File f = new File("C:\\Users\\Pramod\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		 AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
		service.start();
		 DesiredCapabilities da = new DesiredCapabilities(); 
		da.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		da.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi A2");
		da.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		da.setCapability(MobileCapabilityType.UDID, "e434dac9");
		
		//to open the perticular app
		da.setCapability("appPackage", "io.appium.android.apis");
		da.setCapability("appActivity", ".ApiDemos");
		
		URL u =new URL("http://localhost:4723");
		AndroidDriver  driver = new AndroidDriver(u,da);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		driver.quit(); 
		service.stop();
	}
}
