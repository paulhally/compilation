import java.util.Vector;


public class Programme {

	private Vector<Declaration> listeDeclaration;

	public Programme() {
		this.listeDeclaration = new Vector<Declaration>();
	}

	
	public Vector<Declaration> getListeDeclaration() {
		return listeDeclaration;
	}

	public void setListeDeclaration(Vector<Declaration> listeDeclaration) {
		this.listeDeclaration = listeDeclaration;
	}
	
	public void ajouterDeclaration(Declaration d ){
		System.out.println("declaration");
		listeDeclaration.add(d);
		System.out.println("declaration ok");
	}
	
	public void affectation(String id,String value){
		Type type = null;
		System.out.println("Affectation");
		int position=0;
		for(int i=0;i<listeDeclaration.size();i++){
		
			if(listeDeclaration.get(i).getId().equals(id)){
				
				type=listeDeclaration.get(i).getType();
				position=i;
				break;
			}
		}
		System.out.println(value);
		if(type.toString()=="INTEGER"){
				listeDeclaration.get(position).setvInt(Integer.valueOf(value));
		}
		else if(type.toString()=="FLOAT"){
				listeDeclaration.get(position).setvFloat(Float.valueOf(value));
		}
		else if(type.toString()=="BOOLEAN"){
			listeDeclaration.get(position).setvBool(Boolean.valueOf(value));
		}
		else if(type.toString()=="CHARACTER") {
			listeDeclaration.get(position).setvChar(value);
		}
		
		System.out.println("Affectation ok");
	}
}
