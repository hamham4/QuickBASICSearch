package fastNFA;

public class Utility {

	private Utility(){
		
	}
	
	
	static public Boolean isAlpha(String string) {
		return string.matches("[a-zA-Z \\s]+");
	}
	
}
