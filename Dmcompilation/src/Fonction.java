import java.util.Vector;


public class Fonction {

	private Type type;
	private Vector<Parametre> listeParametre;
	private Vector<Declaration> listeDeclaration;

	
	
	
	public Fonction() {
	
	
		this.listeParametre = new Vector<Parametre>();
		this.listeDeclaration = new Vector<Declaration>();

	}

	public void affectation(String id,String value){
		Type type = null;
		System.out.println("Affectation");
		int position=0;
		for(int i=0;i<listeDeclaration.size();i++){
			if(listeDeclaration.get(i).getId()==id){
				type=listeDeclaration.get(i).getType();
				position=i;
				break;
			}
		}
		
		if(type.toString()=="INTEGER"){
				listeDeclaration.get(position).setvInt(Integer.valueOf(value));
		}
		else if(type.toString()=="FLOAT"){
			
		}
		else if(type.toString()=="BOOLEAN"){
			
		}
		else {}
		
		System.out.println("Affectation ok");
	}
	public void ajouterDeclaration(Declaration d ){
		System.out.println("declaration");
		listeDeclaration.add(d);
		System.out.println("declaration ok");
	}
	
	public void ajouterParametre(Parametre p ){
		System.out.println("parametre");
		 listeParametre.add(p);
		 System.out.println("param ok");
	}
	
	public void clearListe(){
		System.out.println("clear");
		listeParametre.clear();
		listeDeclaration.clear();
		System.out.println("clear ok");
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
