package com.juaracoding.ujiantiga.drivers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import com.juaracoding.ujiantiga.drivers.DriverSingleton;

public class Register {
	
	private WebDriver driver;
	
	public Register() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='reg_username']")
	private WebElement username;
	@FindBy(xpath = "//input[@id='reg_email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='reg_password']")
	private WebElement password;
	@FindBy(xpath = "//button[@name='register']")
	private WebElement btnRegister;
	
	public void rgstr(String username, String email, String password) {
		this.username.sendKeys(username);
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		btnRegister.click();
	}
	
	
}
