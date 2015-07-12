package com.garage.moteur;

import com.garage.moteur.Moteur;
import com.garage.moteur.TypeMoteur;

public class MoteurElectrique extends Moteur {

	public MoteurElectrique(String cyl, Double pPrix) {
		super(cyl, pPrix);
		super.type = TypeMoteur.ELECTRIQUE;
	}

}
