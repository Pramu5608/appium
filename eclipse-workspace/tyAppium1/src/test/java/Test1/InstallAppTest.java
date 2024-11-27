package Test1;

import java.io.IOException;



import io.appium.java_client.AppiumBy;

public class InstallAppTest extends baseClass {
	
	
	public void installApp() throws IOException {
	
		 baseClass bc = new baseClass();
		 bc.setUp();
	
	driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
	
	 }

}
