package testBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class base {
	public static AndroidDriver driver;
	public static URL u;
	public static DesiredCapabilities dc;
	public static  AndroidDriver setUp() throws MalformedURLException {
		
		
		
			
			dc = new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("automationName","uiAutomator2");
			dc.setCapability("UDID", "e434dac9");
			dc.setCapability("noReset", true);
			dc.setCapability("ignoreHiddenApiPolicyError",true);
			dc.setCapability("autoGrantPermissions", true);
			
			// dc.setCapability("app", "C:\\\\Users\\\\Pramod\\\\Downloads\\\\ApiDemos-debug.apk");
			
			 dc.setCapability("appPackage","io.appium.android.apis");
			 dc.setCapability("appActivity", ".ApiDemos");
			
			  u = new URL("http://localhost:4723");
			 driver = new AndroidDriver(u,dc);
			 
			 return driver;
			 

	}

}
