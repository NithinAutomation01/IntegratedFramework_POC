package com.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.pages.AmazonHomePage;

public class Basicflow2 extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName="testFile";
		testcaseName="CertTesing";
		  testcaseDec = "QA testing for Amazon site"; author="Nithin";
		  category="sanity";
	}
	
	
	
	
	@Test
	public void tc008() throws IOException{
		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickLaptops().
		selectAppleBrand().clickAppleLaptop();


		
	}


}
