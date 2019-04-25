package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	
    WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAddProduct() {
		driver.findElement(By.xpath("//a[@data-original-title='Add New']")).click();
	}

}
