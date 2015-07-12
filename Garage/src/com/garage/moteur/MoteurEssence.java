package com.garage.moteur;

import com.garage.moteur.Moteur;
import com.garage.moteur.TypeMoteur;

public class MoteurEssence extends Moteur {

	public MoteurEssence(String cyl, Double pPrix) {
		super(cyl, pPrix);
		super.type = TypeMoteur.ESSENCE;
	}

}
