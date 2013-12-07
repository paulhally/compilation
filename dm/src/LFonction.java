import java.util.Vector;


public class LFonction {

	private Fonction fonction;
	private Vector<Fonction> listeFonction;
	private static int id;
	
	public LFcontion(Fonction f){
		fonction = new Fonction(f);
		listeFonction.add(fonction);
		this.id = id++;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

	public Vector<Fonction> getListeFonction() {
		return listeFonction;
	}

	public void setListeFonction(Vector<Fonction> listeFonction) {
		this.listeFonction = listeFonction;
	}
	
	
}
