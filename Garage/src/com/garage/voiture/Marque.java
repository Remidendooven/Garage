package com.garage.voiture;

import java.io.Serializable;

public enum Marque  implements Serializable{

	PIGEOT ("Voiture PIGEOT"),
	RENO ("Voiture RENO"),
	TROEN ("Voiture TROEN");
	
	private String nom = "";
	
	Marque(String pNom){
		this.nom = pNom;
	}
	
	public String toString(){
		return this.nom;
	}
	
}
