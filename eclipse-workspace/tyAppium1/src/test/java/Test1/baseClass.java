package Test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class baseClass {
	public AndroidDriver driver;
	public URL u;
	public DesiredCapabilities dc;
	
	
	public AndroidDriver setUp() throws MalformedURLException {
		
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
