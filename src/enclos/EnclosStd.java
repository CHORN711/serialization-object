package enclos;

import java.util.ArrayList;

import animaux.Animal;
import comportements.Environement;

public class EnclosStd extends Enclos implements Environement {
public Environement environement;

public EnclosStd() {
	
}


	public Environement getEnvironement() {
	return environement;
}


public void setEnvironement(Environement environement) {
	this.environement = environement;
}


	public EnclosStd(String nomCage, ArrayList<Animal> listeAnim, int surface, double longueur, double largeur,
			double hauteur, String typeCage, Environement environement) {
		super(nomCage, listeAnim, surface, longueur, largeur, hauteur, typeCage, environement);
	}

}
