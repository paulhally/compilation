import java.util.Vector;


public class Fonction {

	private Type type;
	private Vector<Parametre> listeParametre;
	private Vector<Declaration> listeDeclaration;

	
	
	
	public Fonction(Type type) {
	
		this.type = type;
		this.listeParametre = new Vector<Parametre>();
		this.listeDeclaration = new Vector<Declaration>();

	}


	
	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}



	public Vector<Parametre> getListeParametre() {
		return listeParametre;
	}



	public void setListeParametre(Vector<Parametre> listeParametre) {
		this.listeParametre = listeParametre;
	}



	public Vector<Declaration> getListeDeclaration() {
		return listeDeclaration;
	}



	public void setListeDeclaration(Vector<Declaration> listeDeclaration) {
		this.listeDeclaration = listeDeclaration;
	}






} 
