
import java.io.*;
import java.lang.*;
import java.util.*;


public class Langage {

	private static int id;
	private LFonction listef;

	
	private Programme p;

	
	public Langage(){
		listef = new LFonction();
	
		this.p = p;
		this.id = id++;
	}
	
	public void ajouterFonction(Fonction f){
		
		listef.getListeFonction().add(f);
	
	}
	
	
	public Programme getP() {
		return p;
	}

	public void setP(Programme p) {
		this.p = p;
	}

	public LFonction getLf() {
		return listef;
	}
	
	
	
	
}