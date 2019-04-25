package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
    WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCatalog() {
		
		driver.findElement(By.xpath("//a[text()=' Catalog']")).click();
	}
	
    public void clickProducts() {
		
    	driver.findElement(By.xpath("//a[text()='Products']")).click();
	}
    
    public void clickUsername() {
		
    	driver.findElement(By.xpath("//a[text()='demo demo ']")).click();
	}
    
    public void clickYourProfile() {
		
    	driver.findElement(By.xpath("//a[text()=' Your Profile']")).click();
	}
    
    public void clickSupportForum() {
		
    	driver.findElement(By.xpath("//a[text()=' Support Forum']")).click();
	}
    
    

}
