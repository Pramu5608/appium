package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class logIn {
	AndroidDriver  driver;
	@FindBy(id="android:id/text1")
	private WebElement ele1;
	
	@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement ele2;
	
	
	public logIn(AndroidDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public AndroidDriver getDriver() {
		return driver;
	}
	public WebElement getele1() {
		return ele1;
		
	}
	
	public WebElement getele2() {
		return ele2;
}
}

