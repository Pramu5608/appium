package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage {
WebDriver driver;

logInPage(WebDriver driver){
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath="//inpu[t@placeholder='Username']")
WebElement txt_username;



public void setUsername(String user)
{
	txt_username.sendKeys(user);
}
}
