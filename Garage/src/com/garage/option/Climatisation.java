package com.garage.option;


public class Climatisation implements Option {
	
	public double getPrix() {
		return 347.3;
	}
	
	public String toString() {
		return "Climatisation (" + getPrix() + "�)";
	}
	

}
