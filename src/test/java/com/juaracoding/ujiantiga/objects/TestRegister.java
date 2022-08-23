package com.juaracoding.ujiantiga.objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import com.juaracoding.ujiantiga.drivers.DriverSingleton;
import com.juaracoding.ujiantiga.drivers.pages.LoginPage;
import com.juaracoding.ujiantiga.drivers.pages.Register;

public class TestRegister {
		
		public static WebDriver driver;
		private Register register;
		
		@BeforeClass
		public void setUp() {
			DriverSingleton.getInstance("Chrome");
			WebDriver driver = DriverSingleton.getDriver();
			String url =  "https://shop.demoqa.com/my-account/";
			driver.get(url);
			driver.findElement(By.xpath("//a[normalize-space()='My Account']")).click();
		}
		@BeforeMethod
		public void pageObject() {
			register = new Register();
		}
		
		@Test
		public void testRegister() {
			register.rgstr("evanarendra", "evanarendra7@gmail.com", "itispass");	
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
