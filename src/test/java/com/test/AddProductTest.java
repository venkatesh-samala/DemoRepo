package com.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.AddProductPage;
import com.pages.AdminLoginPage;
import com.pages.DashboardPage;
import com.pages.ProductsPage;

public class AddProductTest extends BaseTest {
	
	@Test
	public void addProductMethod() {
		AdminLoginPage alp = new AdminLoginPage(driver);
		alp.login("demo", "demo");
		
		DashboardPage dp = new DashboardPage(driver);
		dp.clickCatalog();
		dp.clickProducts();
		
		ProductsPage pp = new ProductsPage(driver);
		pp.clickAddProduct();
		
		AddProductPage app = new AddProductPage(driver);
		app.addproduct();
		app.clickSave();
		
		String expected="Warning: You do not have permission to modify products!";
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
