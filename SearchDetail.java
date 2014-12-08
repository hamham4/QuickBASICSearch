package fastNFA;

import java.net.URL;
import java.util.List;

public class SearchDetail {
	private int numResults;
	private URL searchURL;
	private String searchTerm;
	private boolean searched = false;
	private boolean mandatory = true;
	private List<SearchDetail> searchVariations; 
	
	public SearchDetail(String searchTerm, URL searchURL) {
		this.searchTerm = searchTerm;
		this.searchURL = searchURL;
	}

	public int getNumResults() {
		return numResults;
	}

	public void setNumResults(int numResults) {
		this.numResults = numResults;
	}

	public URL getSearchURL() {
		return searchURL;
	}

	public String getSearchTerm() {
		return searchTerm;
	}

	public boolean wasSearched() {
		return searched;
	}

	public void setSearched(boolean searched) {
		this.searched = searched;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	public List<SearchDetail> getSearchVariations() {
		return searchVariations;
	}

	public void setSearchVariations(List<SearchDetail> searchVariations) {
		this.searchVariations = searchVariations;
	}
	
}