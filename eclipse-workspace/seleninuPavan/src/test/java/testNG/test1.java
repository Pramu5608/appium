package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

  
public class test1 {
	
	@BeforeMethod
void login() {
	System.out.println("this is log in");
}
@Test(priority=1)
void search() {
	System.out.println("this is serach");}
@Test(priority=2)
	void advsearch() {
		System.out.println("this is advserach");
}
	@AfterMethod
	void logut() {
		System.out.println("this is logout");
}
	}
