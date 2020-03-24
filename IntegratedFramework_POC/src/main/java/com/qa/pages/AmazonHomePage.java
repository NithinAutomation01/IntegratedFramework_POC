 package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.ApplicationSpecifics.ProjectSpecificMethods;

public class AmazonHomePage extends ProjectSpecificMethods{
	
	public DropDownPage tooltipClick() {
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		return new DropDownPage();
	}

}
