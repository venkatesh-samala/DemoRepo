package com.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AdminLoginPage;
import com.pages.DashboardPage;
import com.pages.ProfilePage;

public class ProfileTest extends BaseTest {
	
	@Test
	public void profileMethod() {
		AdminLoginPage alp = new AdminLoginPage(driver);
		alp.login("demo", "demo");
		DashboardPage dp = new DashboardPage(driver);
		dp.clickUsername();
		dp.clickYourProfile();
		ProfilePage pp = new ProfilePage(driver);
		pp.clickSaveProfile();
		String expected="Warning: You do not have permission to modify your profile!";
		String actual=verifyText();
		System.out.println(actual);
		Assert.assertTrue(actual.contains(expected));
	}

	public String verifyText() {
		// TODO Auto-generated method stub
		String errortext = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		return errortext;
	}

}
