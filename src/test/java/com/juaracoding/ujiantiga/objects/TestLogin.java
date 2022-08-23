package com.juaracoding.ujiantiga.objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.ujiantiga.drivers.DriverSingleton;
import com.juaracoding.ujiantiga.drivers.pages.LoginPage;


public class TestLogin {

		public static WebDriver driver;
		private LoginPage loginPage;
		
		@BeforeClass
		public void setUp() {
			DriverSingleton.getInstance("Chrome");
			WebDriver driver = DriverSingleton.getDriver();
			String url =  "https://shop.demoqa.com/my-account/";
			driver.get(url);
		}
		
		@BeforeMethod
		public void pageObject() {
			loginPage = new LoginPage();
		}
		
		@Test
		public void testLogin() {
			loginPage.login("evanarendra", "itispass");
		}
		
		@AfterClass 
		public void closeBrowser() {
			delay(3);
			driver.quit();
		}
		
		static void delay(int detik) {
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
