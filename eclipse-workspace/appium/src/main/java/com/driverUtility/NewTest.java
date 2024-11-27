package com.driverUtility;

import org.testng.annotations.Test;

import com.GestureUtility.geusuteUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import tests.logIn;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest{
	AppiumDriverLocalService service;
	public AndroidDriver  driver;
	public geusuteUtility gUtil;
	public driverUtility dUtil;
	public logIn lp;
	
	@BeforeSuite
	  public void startServer() {
		File f = new File("C:\\Users\\Pramod\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		 service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
		service.start();
	  }
	@BeforeMethod
	  public void openApp()throws Throwable {
		DesiredCapabilities da = new DesiredCapabilities(); 
		da.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		da.setCapability(MobileCapabilityType.DEVICE_NAME, "Mi A2");
		da.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		da.setCapability(MobileCapabilityType.UDID, "e434dac9");
		
		//to open the perticular app
		da.setCapability("appPackage", "com.androidsample.generalstore");
		da.setCapability("appActivity", ".SplashActivity");
		
		URL u =new URL("http://localhost:4723");
		 driver = new AndroidDriver(u,da);
		  gUtil = new geusuteUtility(driver);
		  dUtil = new driverUtility(driver);
		  lp = new logIn(driver);
	  }
 

  @AfterMethod
  public void closeApp() {
	  driver.quit();
  }

@AfterSuite
  public void stopServer() {
	service.stop(); 
  }

}
