package com.test.ExtentReporting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.pages.AmazonHomePage;

public class TestNGExtentReporting extends TakeScreenShot{
	public WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest testFrame, node;
	@BeforeSuite
	public void startReport(){
		reporter = new ExtentHtmlReporter("./ExtentReport/result.html");
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		testFrame = extent.createTest("My AmazonTest", " Amazon Flow validations");
		 
		/*@Test
		public void test_0003(){
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			    driver = new ChromeDriver();
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
				driver.get("https://www.amazon.in/");
		  }
		 @Test
			public void tc008(){
				new AmazonHomePage().tooltipClick().
				clickMobilesAndComputers().clickLaptops().
				selectAppleBrand().clickAppleLaptop();


				
			}

		  @AfterMethod
		  public void afterMethoddf() throws InterruptedException {
			  driver.close();
			  Thread.sleep(3000);
		  }

		
	}
	*/
	
	

}
