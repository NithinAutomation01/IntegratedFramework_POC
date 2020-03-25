package com.qa.pages.MobilesAndLaptops;

import com.amazon.selenium.base.SeleniumBase;


public class MobilesPage extends SeleniumBase {
	public  LGMobile clickLGMobile() {
		click(locateElement("xpath", "(//span[contains(text(),'Apple')])[6]"));
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new LGMobile();
	}
	
	public  OppoMobile clickOppoMobile() {
		click(locateElement("xpath", "(//*[contains(text(),'LG')])[2]"));
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new OppoMobile();
	}
	public  RealmeMobile clickRealmeMobile() {
		click(locateElement("xpath", "(//*[contains(text(),'Realme')])"));
		/*driver.findElement(By.xpath("//span[contains(text(),'Apple')]")).click();*/
		return new RealmeMobile();
	}

}
