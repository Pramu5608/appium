package com.driverUtility;



import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.android.AndroidDriver;

public class driverUtility {
	AndroidDriver driver;
	
public driverUtility( AndroidDriver driver) {
		
		this.driver =driver;
}
public void installApp(String apkFilePath) {
	driver.installApp(apkFilePath);
}
public void activateApp(String apkFilePath) {
	driver.activateApp(apkFilePath);
}
public boolean isAppInstalled (String appPackage) {
	boolean appInstalled = driver.isAppInstalled(appPackage);
return appInstalled;
}
public void rotateToPortrait() {
	ScreenOrientation sc =driver.getOrientation();
	driver.rotate(sc.PORTRAIT);
}


}
