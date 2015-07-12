package com.garage.moteur;
import java.io.Serializable;
import com.garage.moteur.TypeMoteur;

abstract class Moteur implements Serializable {
		protected TypeMoteur type;
		protected String cylindre;
		protected Double prix;
		
		
		public Moteur(){
			
		}
		public Moteur(String cylindre,double prix) {
		    this.cylindre=cylindre;
		    this.prix=prix;
		}
		
		public Double getPrix(){
			return this.prix;
		}
		
		public String toString(){
			return type + " " + cylindre;
		}
		

		

	}

