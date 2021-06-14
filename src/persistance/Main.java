package persistance;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import enclos.Polaire;
import animaux.Animal;
import animaux.Ours;
import comportements.Environement;
import enclos.Enclos;
import enclos.EnclosStd;
import zoo.Zoo;

public class Main {
	public static void main(String[] args) {
		
		//DEB : lecture du fichier de CONFIG par défaut
		Properties prop = new Properties();
		/* Ici le fichier contenant les données de configuration est nommé 'zoo.cfg' */
		FileInputStream in;
		String monFichierXML = "";
		try {
			in = new FileInputStream("zoo.cfg");
			prop.load(in);
			// Extraction des propriétés
			String PATH = prop.getProperty("PATH");
			String OUTPUTFILEXML = prop.getProperty("OUTPUTFILEXML");
			monFichierXML = PATH+OUTPUTFILEXML;
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("impossible d'accéder au fichier : zoo.cfg");
		}
		//FIN : lecture du fichier de CONFIG par défaut
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Ours ours1 = new Ours("Booba");
		Ours ours2 = new Ours("Kaaris");
		Ours ours3 = new Ours("RIMK");
		Ours ours4 = new Ours("PLK");
		ArrayList<Animal> listeOurs1 = new ArrayList<Animal>();
		ArrayList<Animal> listeOurs2 = new ArrayList<Animal>();
		listeOurs1.add(ours1);
		listeOurs1.add(ours2);
		listeOurs2.add(ours3);
		listeOurs2.add(ours4);
		
		EnclosStd enclos1 = new EnclosStd("LG",listeOurs1, 180, 210, 500, 450,"Ouvert", new Polaire());
		EnclosStd enclos2 = new EnclosStd("BD",listeOurs2, 180, 210, 500, 450,"Ouvert", new Polaire());
		ArrayList<Enclos> listeEnclos = new ArrayList<Enclos>();
		listeEnclos.add(enclos1);
		listeEnclos.add(enclos2);
		Zoo zoo1 = new Zoo(listeEnclos);
		zooXMLGenerator(zoo1, monFichierXML);
		
		//lecture du XML et création de l'obj Zoo
		Zoo monZoo = zooXMLReader(monFichierXML);
		System.out.println(monZoo.getClass().getName());
		monZoo.setNameZoo("Zoo de Vincennes");
		System.out.println(monZoo);
		
	}
	public static void zooXMLGenerator(Zoo zoo, String monFichierXML) {

        XMLEncoder e = null;
        try {
			e = new XMLEncoder(
                    new BufferedOutputStream(
                            new FileOutputStream(monFichierXML)));
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        e.writeObject(zoo);
        e.close();
    }

	public static Zoo zooXMLReader(String monFichierXML) {

        XMLDecoder d = null;
        Zoo ressultObj = null;
        try {
            d = new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream(monFichierXML)));
            ressultObj = (Zoo) d.readObject();
            d.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException ) {
        	ArrayIndexOutOfBoundsException.printStackTrace();
        }
        return ressultObj;
    }

}
