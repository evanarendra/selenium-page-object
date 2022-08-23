package com.juaracoding.ujiantiga.main;

import org.openqa.selenium.WebDriver;


import com.juaracoding.ujiantiga.drivers.DriverSingleton;
import com.juaracoding.ujiantiga.drivers.pages.LoginPage;

public class MainApp {
		
		public static void main(String[] args) {
			DriverSingleton.getInstance("Chrome");
			WebDriver driver = DriverSingleton.getDriver();
			String url = "https://opensource-demo.orangehrmlive.com";
			driver.get(url);
			
			LoginPage loginPage = new LoginPage();
			loginPage.login("Admin","admin1234");
			
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
