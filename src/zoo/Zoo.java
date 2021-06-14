package zoo;

import java.util.ArrayList;

import enclos.Enclos;


public class Zoo {
	
	private String nameZoo;
	
	ArrayList<Enclos> listeCg;

    public Zoo(ArrayList<Enclos> listeCg) {
        this.listeCg = listeCg;
    }
    public Zoo(){
    }

    public ArrayList<Enclos> getListeCg() {
		return listeCg;
	}
	public void setListeCg(ArrayList<Enclos> listeCg) {
		this.listeCg = listeCg;
	}
	@Override
    public String toString() {
        return "Nom du zoo : "+ nameZoo + " [listeCg=" + listeCg + "]";
    }
	public String getNameZoo() {
		return nameZoo;
	}
	public void setNameZoo(String nameZoo) {
		this.nameZoo = nameZoo;
	}
    


}
		


