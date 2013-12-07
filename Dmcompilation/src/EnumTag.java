public enum EnumTag { 
    
    AND ("&&"), 
	OR ("||"), 
	LT ("<"), 
	GT (">"), 
	LE ("<="), 
	GE (">="), 
	EQ ("=="),
	NON("!"),
	DIFF ("!=") , 
	PLUS ("+"), 
	MINUS ("-"), 
	MINUS_U ("-"), 
	MULT ("*"), 
	DIV ("/"),
	IMP("->"),
	NUMBER("num"),
	EQUI("<->");
    
    private final String tag;

    EnumTag(String s){
	tag = s;
    }
    
    public String toString(){
	return tag;
    }
    
}
