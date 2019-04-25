package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
	
    WebDriver driver;
	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSaveProfile() {
		
		driver.findElement(By.xpath("//button[@data-original-title='Save']")).click();
	}

}
