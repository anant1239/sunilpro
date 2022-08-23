package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpom {
	
private WebDriver driver; 
	
	public logoutpom(WebDriver driver) {
		this.driver= driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logout_button")
	private WebElement logout; 
	
	public void clickLogoutBtn() {
		this.logout.click(); 
	}


}