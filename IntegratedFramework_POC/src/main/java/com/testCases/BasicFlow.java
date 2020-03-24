package com.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.pages.AmazonHomePage;

public class BasicFlow extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFileName="testFile";
		testcaseName="CertTesing";
		  testcaseDec = "QA testing for Amazon site"; author="Nithin";
		  category="sanity";
	}
	
	@Test
	public void tc008(){
		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickLaptops().
		selectAppleBrand().clickAppleLaptop();


		
	}
	@Test
	public void tc005(){
		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickLaptops().
		selectAppleBrand().clickAppleLaptop();


		
	}
	@Test
	public void tc001(){
		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickLaptops().
		selectAppleBrand().clickAppleLaptop();

	}
	@Test
	public void tc002(){
		new AmazonHomePage().tooltipClick().clickTv_Appliances_Electronics()
		.clickTelevision().clickOneplusTvBrand().testBasePrice();

	}
	@Test
	public void tc003(){
		new AmazonHomePage().tooltipClick().clickTv_Appliances_Electronics()
		.clickTelevision().clickOneplusTvBrand().get2DaysDelivery();

	}


}