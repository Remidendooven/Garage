package com.garage.option;


public class GPS implements Option {
	
	public double getPrix() {
		return 113.5;
	}
	public String toString() {
		return "GPS (" + getPrix() + "�)";
	}

}
