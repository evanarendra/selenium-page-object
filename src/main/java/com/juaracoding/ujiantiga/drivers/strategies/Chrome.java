package com.juaracoding.ujiantiga.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {
	public WebDriver SetStrategy() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\123\\Videos\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		return new ChromeDriver(options);
	}

	@Override
	public WebDriver setStrategy() {
		// TODO Auto-generated method stub
		return null;
	}
}
