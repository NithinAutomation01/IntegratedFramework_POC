package com.testCases;


import java.sql.*;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.pages.AmazonHomePage;

import utils.FileReaderHandle;
import utils.JdbcConnectivity;


public class TestFlow2 extends ProjectSpecificMethods{
	  FileReaderHandle fh = new FileReaderHandle();
	  JdbcConnectivity jc = new JdbcConnectivity();
	
	  @BeforeTest
	public void setData() {
		excelFileName="testFile";
		testcaseName="CertTesing";
		  testcaseDec = "QA testing for Amazon site"; author="Nithin";
		  category="sanity";
	                       }
	
 
	  @Test
	  public void tc001() throws Exception{
		String st = fh.PropertiesHandler("testdata").getProperty("value");
		System.out.println("testing the flow :"+st);
        new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickLaptops().
		selectAppleBrand().clickAppleLaptop();
		
			
	}
	  @Test
	  public void tc003()throws Exception{
		  String QA_credentials = fh.PropertiesHandler("Datavalidations").getProperty("QA_environment");
		  System.out.println(QA_credentials);
	  }
	  
	  @Test
	  public void tc002() throws Exception{
		 
		Connection con = jc.mysql_connectivity();
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from testData where field_name='QA environment' ");
		while(rs.next()){
			System.out.println(rs.getString(2));
		}
	  }
}