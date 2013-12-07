
public class Declaration {

	Type type;
	char vChar;
	int vInt;
	boolean vBool;
	float vFloat;
	String id;
	
	public Declaration(Type t,String id){
		this.type=t;
		this.id=id;
	}

	public Declaration(EnumType t,String id,int valeur){
		type=new Type(t);
		this.id=id;
		vInt=valeur;
	}

	public Declaration(EnumType t,String id,float valeur){
		type=new Type(t);
		this.id=id;
		vFloat=valeur;
	}
	
	public Declaration(EnumType t,String id,char valeur){
		type=new Type(t);
		this.id=id;
		vChar=valeur;
	}
	
	public Declaration(EnumType t,String id,boolean valeur){
		type=new Type(t);
		this.id=id;
		vBool=valeur;
	}

	
	
}
