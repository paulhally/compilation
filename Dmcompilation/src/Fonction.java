import java.util.Vector;


public class Fonction {

	private Type type;
	private String nom=new String();
	private Vector<Parametre> listeParametre;
	private Vector<Declaration> listeDeclaration;
	private Vector<Instruction> listeInstruction;
	
	
	
	public Fonction() {
	
	
		this.listeParametre = new Vector<Parametre>();
		this.listeDeclaration = new Vector<Declaration>();
		this.listeInstruction=new Vector<Instruction>();
	}
	
	public void ajouterInstruction(Instruction i){
		listeInstruction.add(i);
	}
	public void affectation2(String id,String id2){
		boolean dec=false;
		boolean par=false;
		boolean dec2=false;
		boolean par2=false;
		int position = 0;
		int position2 = 0;
		Type type=null;
		for(int i=0;i<listeDeclaration.size();i++){
			
			if(listeDeclaration.get(i).getId().equals(id)){
				
				type=listeDeclaration.get(i).getType();
				position=i;
				dec=true;
				break;
			}
		}
		
		for(int i=0;i<listeParametre.size();i++){
			
			if(listeParametre.get(i).getId().equals(id)){
				
				type=listeParametre.get(i).getType();
				position=i;
				par=true;
				break;
			}
		}
	
		
		for(int i=0;i<listeDeclaration.size();i++){
			
			if(listeDeclaration.get(i).getId().equals(id2)){
				
				type=listeDeclaration.get(i).getType();
				position=i;
				dec2=true;
				break;
			}
		}
		
		for(int i=0;i<listeParametre.size();i++){
			
			if(listeParametre.get(i).getId().equals(id2)){
				
				type=listeParametre.get(i).getType();
				position=i;
				par2=true;
				break;
			}
		}
		
		if(dec && dec2){
			if(listeDeclaration.get(position).getType().toString().equals(listeDeclaration.get(position2).getType().toString())){
				type=listeDeclaration.get(position).getType();
				if(type.toString()=="INTEGER"){
					listeDeclaration.get(position).setvInt(listeDeclaration.get(position2).getvInt());
				}
				else if(type.toString()=="FLOAT"){
					listeDeclaration.get(position).setvFloat(listeDeclaration.get(position2).getvFloat());
				}
				else if(type.toString()=="BOOLEAN"){
					listeDeclaration.get(position).setvBool(listeDeclaration.get(position2).isvBool());
				}
				else if(type.toString()=="CHARACTER") {
					listeDeclaration.get(position).setvChar(listeDeclaration.get(position2).getvChar());
				}
			}
		}
		else if(dec && par2){
			if(listeDeclaration.get(position).getType().toString().equals(listeParametre.get(position2).getType().toString())){
				type=listeDeclaration.get(position).getType();
				if(type.toString()=="INTEGER"){
					listeDeclaration.get(position).setvInt(listeParametre.get(position2).getvInt());
				}
				else if(type.toString()=="FLOAT"){
					listeDeclaration.get(position).setvFloat(listeParametre.get(position2).getvFloat());
				}
				else if(type.toString()=="BOOLEAN"){
					listeDeclaration.get(position).setvBool(listeParametre.get(position2).isvBool());
				}
				else if(type.toString()=="CHARACTER") {
					listeDeclaration.get(position).setvChar(listeParametre.get(position2).getvChar());
				}
			}
		}
		else if(par && dec2){
			if(listeParametre.get(position).getType().toString().equals(listeDeclaration.get(position2).getType().toString())){
				type=listeParametre.get(position).getType();
				if(type.toString()=="INTEGER"){
					listeParametre.get(position).setvInt(listeDeclaration.get(position2).getvInt());
				}
				else if(type.toString()=="FLOAT"){
					listeParametre.get(position).setvFloat(listeDeclaration.get(position2).getvFloat());
				}
				else if(type.toString()=="BOOLEAN"){
					listeParametre.get(position).setvBool(listeDeclaration.get(position2).isvBool());
				}
				else if(type.toString()=="CHARACTER") {
					listeParametre.get(position).setvChar(listeDeclaration.get(position2).getvChar());
				}
			}
		}
		
	}
	
	public void affectation(String id,String value){
		Type type = null;
		System.out.println("Affectation");
		int position=0;
		boolean dec=false;
		boolean par=false;
		for(int i=0;i<listeDeclaration.size();i++){
		
			if(listeDeclaration.get(i).getId().equals(id)){
				
				type=listeDeclaration.get(i).getType();
				position=i;
				dec=true;
				break;
			}
		}
		
		for(int i=0;i<listeParametre.size();i++){
			
			if(listeParametre.get(i).getId().equals(id)){
				
				type=listeParametre.get(i).getType();
				position=i;
				par=true;
				break;
			}
		}
		System.out.println(value);
		if(dec){
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
		}
		else if (par){
			if(type.toString()=="INTEGER"){
				listeParametre.get(position).setvInt(Integer.valueOf(value));
			}
			else if(type.toString()=="FLOAT"){
					listeParametre.get(position).setvFloat(Float.valueOf(value));
			}
			else if(type.toString()=="BOOLEAN"){
				listeParametre.get(position).setvBool(Boolean.valueOf(value));
			}
			else if(type.toString()=="CHARACTER") {
				listeParametre.get(position).setvChar(value);
			}
		}
		else{
			System.out.println("Erreur d'affectation, vérifiez que la déclaration a bien été effectuée pour la variable "+ id);
		}
		
		
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	



} 
