package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.amazon.selenium.base.SeleniumBase;

public class BrandSpecificLaptopPage extends SeleniumBase {
	
	public AppleBrand selectAppleBrand() {
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Apple')]"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", ele);
		return new AppleBrand();
	}
	
	

}
