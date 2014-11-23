 package fastNFA;

import java.util.List;

public class Org {
	private String name;
	private String firstNamePart;
	private String secondNamePart;

	
	public Org(String name) throws IllegalArgumentException{
		if (name == null || name == "" || Utility.isAlpha(name) == false) {
			throw new IllegalArgumentException();
		}
		
		
		this.name = Utility.removePeriods(name);
		
		setSplitNames(this.name);
	}
	

	private void setSplitNames(String name) {
		String[] splitName = name.split("\\s+");
		this.firstNamePart = splitName[0];
		
		if (splitName.length >= 2) {
			this.secondNamePart = splitName[1];
		}
	}

	public String getName() {
		return this.name;

	}
	
	public String getSecondNamePart() {
		return this.secondNamePart;
	}

	public String getFirstNamePart() {
		return this.firstNamePart;
	}

}
