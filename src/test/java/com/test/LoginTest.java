package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AdminLoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginMethod() {
		AdminLoginPage alp = new AdminLoginPage(driver);
		alp.login("demo", "demo");
		String expected="Dashboard";
		String actual=verifyTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}
	
	public String verifyTitle() {
		String pagetitle = driver.getTitle();
		return pagetitle;
	}

}
