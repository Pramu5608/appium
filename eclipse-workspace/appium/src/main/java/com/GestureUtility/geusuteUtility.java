package com.GestureUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class geusuteUtility {

	AndroidDriver driver;
	
	public geusuteUtility( AndroidDriver driver) {
		
		this.driver =driver;
		
	}
	public void longpress( WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
			));
	}
	public void doubleClickGesture( WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()
			));
		
	}
	public void dragGesture( WebElement element,int a, int b) {
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "endX", a,
			    "endY", b
			));
		
	}
	
	public void pinchOpenGesture( WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.75
			));
		
	}
	public void pinchCloseGesture( WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.75
			));
		
	}
	public void swipeGesture( WebElement element,int a, int b,int c, int d ) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", a, "top", b, "width", c, "height", d,
			    "direction", "left",
			    "percent", 0.75
			));
		 
	}
	public void scrollGesture( String value) {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+value+"\"));"));
		
	}
	
}
