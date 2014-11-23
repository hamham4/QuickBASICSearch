 package fastNFA;

import java.net.URL;
import java.util.List;

public class Org implements Searchable {
	private String name;
	private String firstNamePart;
	private String secondNamePart;
	private List<SearchDetail> searchDetails;
	private String URLBase = "https://www.nfa.futures.org/basicnet/SearchResults.aspx?type=firm&firm=";

	
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


	@Override
	public void createSearchDetails() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<SearchDetail> getSearchDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public URL createSearchURL(String searchTerm) {
		// TODO Auto-generated method stub
		return null;
	}

}
