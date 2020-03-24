package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.amazon.selenium.base.SeleniumBase;

public class SubMenuPage extends SeleniumBase {
	
	public BrandSpecificLaptopPage clickLaptops() {
		WebElement ele1 = driver.findElement(By.xpath("//div[contains(text(),'Laptops')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele1);
		return new BrandSpecificLaptopPage();
	}
	

}
