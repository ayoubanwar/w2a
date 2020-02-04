package com.scname.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.scname.base.TestBase;

public class LoginTest extends TestBase{

	@Test
	public void LoginAsBankManager() {
		
		driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
		
		
		
	}
}
