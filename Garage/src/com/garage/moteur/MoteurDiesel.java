package com.garage.moteur;

import com.garage.moteur.Moteur;
import com.garage.moteur.TypeMoteur;

public class MoteurDiesel extends Moteur{
	
	public MoteurDiesel(String cyl, Double pPrix) {
		super(cyl, pPrix);
		super.type = TypeMoteur.DIESEL;
	}	
	
}



