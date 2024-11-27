package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistarionPage extends BasePage {
	
	public AccountRegistarionPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtconfirm;
	
	@FindBy(xpath="//label[normalize-space()='Yes']")
	WebElement RadioSubscribe;
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement CheckPrivacyPolicy;
	
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement ConfirmMessage;
	
	
	
	public void setfirstname(String fname) {
		txtfirstname.sendKeys(fname);
		
	}
	
	public void setlastname(String lname) {
		txtlastname.sendKeys(lname);
		
	}
	
	public void setemail(String email) {
		txtemail.sendKeys(email);
		
	}
	
	public void setTele(String tele) {
		txttelephone.sendKeys(tele);
	}
	
	public void setpassword(String Pass) {
		txtpassword.sendKeys(Pass);
		
	}
	
	public void setconfirmpass(String Pass) {
		txtconfirm.sendKeys(Pass);
		
	}
	
	public void clickSubscribe() {
		RadioSubscribe.click();
	}
	public void clickPrivacypolicy() {
		CheckPrivacyPolicy.click();
	
	
	}
	
	public void clickContinue() {
		btnContinue.click();
	
	}
	public String getconfirmmsg() {
		try {
			return(ConfirmMessage.getText());
		}
		catch(Exception e){
			return(e.getMessage());
		}
		
	}
	
	
	}
