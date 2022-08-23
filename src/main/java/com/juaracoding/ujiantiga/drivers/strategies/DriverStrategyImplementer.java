package com.juaracoding.ujiantiga.drivers.strategies;

public class DriverStrategyImplementer {

	public static DriverStrategy chooseStrategy(String strategy) {
		// TODO Auto-generated method stub
		switch (strategy) {
		case "Chrome":
			
			return new Chrome();
			
		case "Firefox":
			
			return new Firefox();
			
		default:
			return null;
		}
	}

}
