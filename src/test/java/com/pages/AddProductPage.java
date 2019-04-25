package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductPage {
	
	WebDriver driver;
	
	public AddProductPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void addproduct() {
		
		driver.findElement(By.id("input-name1")).sendKeys("Test Product");
		driver.findElement(By.id("input-meta-title1")).sendKeys("Test Meta Title");
		driver.findElement(By.xpath("//a[text()='Data']")).click();
		driver.findElement(By.id("input-model")).sendKeys("Test Input Model");
	}
	
	public void clickSave() {
		
		driver.findElement(By.xpath("//button[@data-original-title='Save']")).click();
	}

}
