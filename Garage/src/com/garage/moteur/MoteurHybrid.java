package com.garage.moteur;

import com.garage.moteur.Moteur;
import com.garage.moteur.TypeMoteur;

public class MoteurHybrid extends Moteur {

	public MoteurHybrid(String cyl, Double pPrix) {
		super(cyl, pPrix);
		super.type = TypeMoteur.HYBRID;
	}

}
