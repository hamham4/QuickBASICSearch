package fastNFA;

public class Utility {

	private Utility(){
		
	}
	
	
	static public Boolean isAlpha(String string) {
		return string.matches("[a-zA-Z \\s\\.]+");
	}
	
	static public String removePeriods(String name) {
		String strippedName = name.replace(".", "");
		return strippedName;
	}
	
}
