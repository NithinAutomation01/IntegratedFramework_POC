package com.qa.pages;

import org.openqa.selenium.By;

import com.amazon.selenium.base.SeleniumBase;


  public  class DropDownPage extends SeleniumBase{
	  
	public SubMenuPage clickMobilesAndComputers() {
		/*click(locateElement("xpath", "//*[contains(text(),'Mobiles, C')]"));*/
		driver.findElement(By.xpath("//*[contains(text(),'Mobiles, C')]")).click();
		return new SubMenuPage();
		
	}
	public Tv_Appliances_Electronics_SubmenuPage clickTv_Appliances_Electronics() {
		click(locateElement("xpath","//div[contains(text(),'TV, Appliances')]"));
		return new Tv_Appliances_Electronics_SubmenuPage();
		
	}


}
