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
	
	static public String[] appendStringArray(String[] beginningArray, String[]endArray) {
		int combinedLength = beginningArray.length + endArray.length;
		String[] combined = new String[combinedLength];
		
		for (int i = 0; i < beginningArray.length; i++) {
			combined[i] = beginningArray[i];
		}
		
		for (int j = 0; j < endArray.length; j++) {
			combined[j + beginningArray.length] = endArray[j];	
		}
		
		return combined;
	}
	
}
