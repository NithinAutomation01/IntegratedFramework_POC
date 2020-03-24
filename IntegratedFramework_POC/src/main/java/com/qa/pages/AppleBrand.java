package com.qa.pages;

import org.openqa.selenium.By;

import com.amazon.selenium.base.SeleniumBase;

public class AppleBrand extends SeleniumBase{

	
	public  Apple clickAppleLaptop() {
		click(locateElement("xpath", "//span[contains(text(),'Apple')]"));
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new Apple();
	}
}
