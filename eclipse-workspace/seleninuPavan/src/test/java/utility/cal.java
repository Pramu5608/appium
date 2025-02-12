package utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cal {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
String filePath = System.getProperty("user.dir")+"\\testData\\calData1.xlsx";
int rows	= utility.getRowCount(filePath, "Sheet1");
System.out.println(rows );
	
	for(int i=1;i<=rows;i++) {
		
		//read data from excel
		String princpleAMT = utility.getCellData(filePath, "Sheet1", i, 0);
		String rateofinterest = utility.getCellData(filePath, "Sheet1", i, 1);
		String per1 = utility.getCellData(filePath, "Sheet1", i, 2);
		String per2 = utility.getCellData(filePath, "Sheet1", i, 3);
		String fre = utility.getCellData(filePath, "Sheet1", i, 4);
		String exp_mValue = utility.getCellData(filePath, "Sheet1", i, 5);
		
		//pass above data into application
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princpleAMT);
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		
		sel.selectByVisibleText(per2);
		
		Select frequency = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		frequency.selectByVisibleText(fre);
		
		
		driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
		//validation
		
		 String Act_Value = driver.findElement(By.xpath("//span[@class='gL_27']/strong")).getText();
		 if(Double.parseDouble(exp_mValue)==Double.parseDouble(Act_Value)) {
			System.out.println("Test Pass");
			utility.setCellData(filePath, "Sheet1", i, 7, "Passed");
			
		 }
		 else {
			 System.out.println("Test Failed");
				utility.setCellData(filePath, "Sheet1", i, 7, "Failed");
		 }
		 driver.findElement(By.xpath("//img[@class='PL5']")).click();
		
	}
	
	driver.quit();
	}
	

}
