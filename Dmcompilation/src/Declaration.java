
public class Declaration {

	Type type;
	String vChar;
	int vInt;
	boolean vBool;
	float vFloat;
	String id;
	
	public Declaration(Type t,String id){
		this.type=t;
		this.id=id;
	}

	public String getvChar() {
		return vChar;
	}

	public void setvChar(String vChar) {
		this.vChar = vChar;
	}

	public int getvInt() {
		return vInt;
	}

	public void setvInt(int vInt) {
		this.vInt = vInt;
	}

	public boolean isvBool() {
		return vBool;
	}

	public void setvBool(boolean vBool) {
		this.vBool = vBool;
	}

	public float getvFloat() {
		return vFloat;
	}

	public void setvFloat(float vFloat) {
		this.vFloat = vFloat;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
