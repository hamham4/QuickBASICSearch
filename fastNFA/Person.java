package fastNFA;

public class Person {
	private String lname;
	private String fname;
	private String firstNameInitial;
	private String firstNameFirstTwoChars;
	private String nickName;
	
	public Person(String lname, String fname) throws IllegalArgumentException {
		if (lname == null || lname == "" || Utility.isAlpha(lname) == false ) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if (fname == null || fname == "") {
			this.fname = null;
		} else if (Utility.isAlpha(fname) == false) {
			throw new IllegalArgumentException("Invalid first name");
		} else {
			this.fname = fname;
		}
		
		this.lname = lname;
		
		
		setFirstNameInitial(this.fname);
		setFirstNameFirstTwoChars(this.fname);
	}
	
	private void setFirstNameInitial(String fname) {
		if (fname == null || fname == "") {
			this.firstNameInitial = null;
		} else {
			this.firstNameInitial = fname.substring(0,1);
		}
	}
	
	private void setFirstNameFirstTwoChars(String fname) {
		if (fname != null && fname != "") {
			if (fname.length() >= 2) {
				this.firstNameFirstTwoChars = fname.substring(0, 2);
			}
		}
	}

	public String getLname() {
		return lname;
	}

	public String getFname() {
		return fname;
	}

	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		
		if(Utility.isAlpha(nickName) == true) {
			this.nickName = nickName;
		}
	}
	

	public String getFirstNameInitial() {
		return firstNameInitial;
	}
	
	public String getFirstNameFirstTwoChars() {
		
		return firstNameFirstTwoChars;
	}




}
