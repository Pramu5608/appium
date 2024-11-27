package testBase;

import java.net.MalformedURLException;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class test1 extends base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver   driver = setUp();

		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.CheckBox[@resource-id='android:id/checkbox']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='WiFi settings']/parent::android.widget.RelativeLayout")).click();
        
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys("Hello");
		driver.findElements(AppiumBy.xpath("//android.widget.Button")).get(1).click();

	}

}
