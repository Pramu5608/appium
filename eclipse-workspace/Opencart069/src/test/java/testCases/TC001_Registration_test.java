package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistarionPage;
import pageObjects.HomePage;
import testBase.baseClass;

public class TC001_Registration_test extends baseClass {
	
	@Test
	public void Verify_account_registration() {
		try {
		logger.info("****** TC001_Registration_testis starts********");
		
		HomePage hp = new HomePage(driver);
		hp.MyaccountbtnClick();
		hp.RegisterbtnClick();
		
		AccountRegistarionPage Ar = new AccountRegistarionPage(driver);
		Ar.setfirstname(randomString().toUpperCase());
		Ar.setlastname(randomString().toUpperCase());
		Ar.setemail(randomString().toLowerCase()+"@gamil.com"); //randomly generated the email
		Ar.setTele(randomNumber());
		
		String Password = randomAlphanumaric();
		Ar.setpassword(Password);
		Ar.setconfirmpass(Password);
		Ar.clickSubscribe();
		Ar.clickPrivacypolicy();
		Ar.clickContinue();
		String confrmsg = Ar.getconfirmmsg();
		System.out.println(confrmsg);
		if(confrmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		else {
			logger.error("******TC001_Registration_test Failed*******");
			logger.debug("Debugg...");
			Assert.assertTrue(false);
		}
		
	
		
		
		//Assert.assertEquals(Ar.getconfirmmsg(),");
		}
		catch(Exception e) {
			
			
			Assert.fail();
		}
		logger.info("test End");
	}
	

}
