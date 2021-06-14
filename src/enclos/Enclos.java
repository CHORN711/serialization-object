package enclos;

import java.util.ArrayList;
import comportements.Environement;
import animaux.Animal;

public abstract class Enclos {
	String nomCage;
	ArrayList<Animal> listeAnim;
	int surface;
	double longueur;
	double largeur;
	double hauteur;
	String typeCage;
	Environement environement;

	public Enclos() {

	}

	public String getNomCage() {
		return nomCage;
	}

	public void setNomCage(String nomCage) {
		this.nomCage = nomCage;
	}

	public ArrayList<Animal> getListeAnim() {
		return listeAnim;
	}

	public void setListeAnim(ArrayList<Animal> listeAnim) {
		this.listeAnim = listeAnim;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public String getTypeCage() {
		return typeCage;
	}

	public void setTypeCage(String typeCage) {
		this.typeCage = typeCage;
	}

	public Environement getEnvironement() {
		return environement;
	}

	public void setEnvironement(Environement environement) {
		this.environement = environement;
	}

	public Enclos(String nomCage, ArrayList<Animal> listeAnim, int surface, double longueur, double largeur,
			double hauteur, String typeCage, Environement environement) {

		this.nomCage = nomCage;
		this.listeAnim = listeAnim;
		this.surface = surface;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.typeCage = typeCage;
		this.environement = environement;
	}

	@Override
	public String toString() {
		return "Cage [nomCage=" + nomCage + ", listeAnim=" + listeAnim + ", surface=" + surface + ", longueur="
				+ longueur + ", largeur=" + largeur + ", hauteur=" + hauteur + ", typeCage=" + typeCage + "]";
	}

}
