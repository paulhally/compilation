
import java.io.*;
import java.lang.*;
import java.util.*;

public class Langage {

	private static int id;
	private LFonction listef;

	
	private Programme p;

	
	public Langage(LFonction lf, Programme p){
		listef = new LFonction();
		listef.setLang(this);
		this.p = p;
		this.id = id++;
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