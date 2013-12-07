import java.util.Vector;


public class LFonction {


	private Vector<Fonction> listeFonction;
	private static int id;
	private Langage lang;
	public LFonction(){
		listeFonction=new Vector <Fonction>();
		this.id = id++;
	}


	
	public void setLang(Langage lang) {
		this.lang = lang;
	}

	

	public Vector<Fonction> getListeFonction() {
		return listeFonction;
	}

	public void setListeFonction(Vector<Fonction> listeFonction) {
		this.listeFonction = listeFonction;
	}
	
	
}
