package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement btnMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement btnRegister;

@FindBy(xpath="//a[normalize-space()='Login']")
WebElement btnLogin;


public void MyaccountbtnClick() {
	btnMyaccount.click();
	
}
public void RegisterbtnClick() {
	btnRegister.click();
	}

public void LoginbtnClick() {
	btnLogin.click();
	}

}
