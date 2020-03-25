package com.testCases;

import java.io.IOException;

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
		try {
			new AmazonHomePage().tooltipClick().
			clickMobilesAndComputers().clickLaptops().
			selectAppleBrand().clickAppleLaptop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}
	@Test
	public void tc005(){
		try {
			new AmazonHomePage().tooltipClick().
			clickMobilesAndComputers().clickLaptops().
			selectAppleBrand().clickAppleLaptop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}
	@Test
	public void tc001(){
		try {
			new AmazonHomePage().tooltipClick().
			clickMobilesAndComputers().clickLaptops().
			selectAppleBrand().clickAppleLaptop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void tc002(){
		try {
			new AmazonHomePage().tooltipClick().clickTv_Appliances_Electronics()
			.clickTelevision().clickOneplusTvBrand().testBasePrice();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void tc003(){
		try {
			new AmazonHomePage().tooltipClick().clickTv_Appliances_Electronics()
			.clickTelevision().clickOneplusTvBrand().get2DaysDelivery();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}