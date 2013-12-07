
import java.io.*;
import java.lang.*;
import java.util.*;

public class Langage {

	private static int id;
	private Vector<LFonction> listefonction;
	private Programme p;

	
	public Langage(LFonction lf, Programme p){
		listefonction = new Vector<LFonction>();
		listefonction.add(fl);
		this.p = p;
		this.id = id++;
	}

	public Programme getP() {
		return p;
	}

	public void setP(Programme p) {
		this.p = p;
	}

	public Vector getLf() {
		return listefonction;
	}
	public void setListefonction(LFonction lf){
		listefonction.add(lf);
	}
	
	
	
}